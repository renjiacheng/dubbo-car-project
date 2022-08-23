package com.oracle.repertory.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.oracle.mapper.RepertoryMapper;
import com.oracle.pojo.dto.ServiceResult;
import com.oracle.pojo.vo.Page;
import com.oracle.pojo.vo.RepertoryBo;
import com.oracle.pojo.vo.RepertoryVo;
import com.oracle.pojo.vo.SearchBean;
import com.oracle.repertory.service.api.RepertoryServiceApi;
import com.oracle.repertory.service.config.EsClientConfig;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ltcstart
 * @date 2022/8/22 - 15:59
 */
public class RepertoryServiceTest extends BaseTest{

    @Autowired(required = false)
    private RepertoryServiceApi repertoryServiceApi;
    @Autowired
    private RepertoryMapper repertoryMapper;

    @Autowired
    private EsClientConfig esClientConfig;

    @Test
    public void getRepertoryListPageTest(){
        Page<List<RepertoryBo>> repertoryListPage = this.repertoryServiceApi.getRepertoryListPage(1, 5);
        System.out.println(repertoryListPage);
    }

    @Test
    public void updateRepertoryNumTest(){
        ServiceResult serviceResult = this.repertoryServiceApi.updateRepertoryNum(1, -44);
        System.out.println(serviceResult.getMsg());
    }

    @Test
    public void addRepertoryTest(){
        RepertoryVo repertoryVo = new RepertoryVo();
        repertoryVo.setCarid(20);
        repertoryVo.setCompanyid(1);
        repertoryVo.setPurchaseprice(new BigDecimal("111"));
        repertoryVo.setIntime(new Date());
        repertoryVo.setRepertorynum(1);

        ServiceResult serviceResult = this.repertoryServiceApi.addRepertory(repertoryVo);

    }

    @Test
    public void test1(){
        String indexName="news";
        //判断索引是否存在
        //创建一个对象用来传递索引名
        GetIndexRequest existRequest = new GetIndexRequest("carrepertory");
        try {
            boolean exists = this.esClientConfig.esRestClient().indices().exists(existRequest, RequestOptions.DEFAULT);
            System.out.println(exists);
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {

        }


    }


    @Test
    public void test2() throws IOException {
        Page<List<RepertoryBo>> repertoryListPage = this.repertoryServiceApi.getRepertoryListPage(1, 5);
        List<RepertoryBo> data = repertoryListPage.getData();
        System.out.println(data);
        for (RepertoryBo repertoryBo : data) {
            IndexRequest indexRequest = new IndexRequest("carrepertory");
            indexRequest.id(repertoryBo.getRepertoryId()+"");
            String json= JSONObject.toJSONString(repertoryBo);
            indexRequest.source(json, XContentType.JSON);
            IndexResponse indexResponse=this.esClientConfig.esRestClient().index(indexRequest,EsClientConfig.COMMON_OPTIONS);
            System.out.println(indexResponse);
        }
    }

    @Test
    public void searchNews(){
        SearchRequest searchRequest=new SearchRequest();
        //指定索引
        searchRequest.indices("carrepertory");
        SearchSourceBuilder searchSourceBuilder=new SearchSourceBuilder();
        //构建查询条件
        searchSourceBuilder.query(QueryBuilders.matchQuery("carName","途"));
        //指定DSL
        searchRequest.source(searchSourceBuilder);

        try {

            List<RepertoryBo> newsIndexList=new ArrayList<>();
            SearchResponse response = this.esClientConfig.esRestClient().search(searchRequest,EsClientConfig.COMMON_OPTIONS);
            SearchHits hits = response.getHits();
            SearchHit[] hitsHits = hits.getHits();
            for (SearchHit hit : hitsHits) {
                String json = hit.getSourceAsString();
                RepertoryBo repertoryBo = JSON.parseObject(json, RepertoryBo.class);
                newsIndexList.add(repertoryBo);
            }
            newsIndexList.stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public QueryBuilder queryBuilders(SearchBean sb){
        if(sb==null){
            MatchAllQueryBuilder matchAllQueryBuilder=QueryBuilders.matchAllQuery();
            return matchAllQueryBuilder;
        }
        BoolQueryBuilder boolQueryBuilder=new BoolQueryBuilder();
        List<MatchQueryBuilder> list=new ArrayList<>();
        if(sb.getCarName()!=null&&!"".equals(sb.getCarName())){
            MatchQueryBuilder titleMatchQueryBuilder= QueryBuilders.matchQuery("carName",sb.getCarName());
            list.add(titleMatchQueryBuilder);
        }
        if(sb.getCompanyName()!=null&&!"".equals(sb.getCompanyName())){
            MatchQueryBuilder authorMatchQueryBuilder=QueryBuilders.matchQuery("companyName",sb.getCompanyName());
            list.add(authorMatchQueryBuilder);
        }
        boolQueryBuilder.must().addAll(list);
//        MatchQueryBuilder idMatchQuery=QueryBuilders.matchQuery("_id",7);
//        MatchPhraseQueryBuilder matchPhraseQueryBuilder = QueryBuilders.matchPhraseQuery("carName", "途观");
//        boolQueryBuilder.mustNot().add(matchPhraseQueryBuilder);
        return boolQueryBuilder;
    }

    @Test
    public void searchNewsMatch(){
//        SearchBean sb=new SearchBean();
        //sb.setTitle("中国");
        //sb.setAuthor("中国日报网");
        SearchRequest searchRequest=new SearchRequest();
        //指定索引
        searchRequest.indices("carrepertory");
        HighlightBuilder highlightBuilder=new HighlightBuilder();
        highlightBuilder.field("carName");
        highlightBuilder.preTags("<b style='color:red'>");   //高亮设置
        highlightBuilder.postTags("</b>");
        SearchSourceBuilder searchSourceBuilder=new SearchSourceBuilder();
        searchSourceBuilder.highlighter(highlightBuilder);
        //构建查询条件
        SearchBean sb = new SearchBean();
        sb.setCarName("途");
        sb.setCompanyName("闪电");

        searchSourceBuilder.query(queryBuilders(sb));
        searchSourceBuilder.sort("_id", SortOrder.DESC);
        //指定DSL
        searchRequest.source(searchSourceBuilder);
        try {
            SearchResponse response = this.esClientConfig.esRestClient().search(searchRequest,EsClientConfig.COMMON_OPTIONS);
            SearchHits hits = response.getHits();
            SearchHit[] hitsHits = hits.getHits();
            List<RepertoryBo> newsIndexList=new ArrayList<>();
            for (SearchHit hitsHit : hitsHits) {
                String sourceAsString = hitsHit.getSourceAsString();
                RepertoryBo repertoryBo= JSONObject.parseObject(sourceAsString,RepertoryBo.class);
                HighlightField highlightField=hitsHit.getHighlightFields().get("carName");
                String highlinghFiled=null;
                if(highlightField!=null){
                    highlinghFiled=highlightField.getFragments()[0].string();
                    repertoryBo.setCarName(highlinghFiled);
                }
                newsIndexList.add(repertoryBo);
            }
            newsIndexList.stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
