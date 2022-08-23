package com.oracle.repertory.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.oracle.mapper.RepertoryMapper;
import com.oracle.pojo.Repertory;
import com.oracle.pojo.RepertoryExample;
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
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ltcstart
 * @date 2022/8/22 - 11:45
 */
@Service
public class RepertoryService implements RepertoryServiceApi {

    @Autowired
    private RepertoryMapper repertoryMapper;

    @Autowired
    private EsClientConfig esClientConfig;



    @Override
    public ServiceResult addRepertory(RepertoryVo repertoryVo) {
        //查询是否以经存在
        RepertoryExample repertoryExample = new RepertoryExample();
        repertoryExample.createCriteria().andCaridEqualTo(repertoryVo.getCarid()).andCompanyidEqualTo(repertoryVo.getCompanyid());
        if(this.repertoryMapper.selectByExample(repertoryExample)==null){
            Repertory repertory = new Repertory();
            BeanUtils.copyProperties(repertoryVo,repertory);
            //插入
            int insert = this.repertoryMapper.insert(repertory);
            //加入es
            try {
                RepertoryBo repertoryBo = this.repertoryMapper.findRepertoryById(repertory.getRepertoryid());
                IndexRequest indexRequest = new IndexRequest("carrepertory");
                indexRequest.id(repertoryBo.getRepertoryId()+"");
                String json= JSONObject.toJSONString(repertoryBo);
                indexRequest.source(json, XContentType.JSON);
                IndexResponse indexResponse=this.esClientConfig.esRestClient().index(indexRequest,EsClientConfig.COMMON_OPTIONS);
            } catch (IOException exception) {
                exception.printStackTrace();
            }

            new ServiceResult(ServiceResult.SUCCESS_CODE,"添加成功",null);
        }
        return new ServiceResult(ServiceResult.SUCCESS_FAIL,"已存在相同的产品",null);
    }

    @Override
    public ServiceResult updateRepertoryNum(Integer repertortId, Integer num) {
        Repertory repertory = this.repertoryMapper.selectByPrimaryKey(repertortId);
        if ((repertory.getRepertorynum()+num)<=0){
            return new ServiceResult(ServiceResult.SUCCESS_FAIL,"修改失败库存数量不能小于0,",null);
        }
        repertory.setRepertorynum(repertory.getRepertorynum()+num);
        this.repertoryMapper.updateByPrimaryKey(repertory);
        return new ServiceResult(ServiceResult.SUCCESS_CODE,ServiceResult.SUCCESS_MSG,null);
    }

    @Override
    public Page<List<RepertoryBo>> getRepertoryListPage(Integer pageNum, Integer pageSize) {
        com.github.pagehelper.Page<RepertoryBo> pages = PageHelper.startPage(pageNum, pageSize);
        this.repertoryMapper.findallRepertory();
        Page<List<RepertoryBo>> pageInfo = new Page<>();
        pageInfo.setPageNums(pageNum);
        pageInfo.setPageSize(pageSize);
        pageInfo.setTotalPage(pages.getPages());
        pageInfo.setAllRow(pages.getTotal());

        List<RepertoryBo> repertoryBoList = pages.getResult().stream().map(repertory -> {
            RepertoryBo repertoryBo = new RepertoryBo();
            BeanUtils.copyProperties(repertory, repertoryBo);
            return repertoryBo;
        }).collect(Collectors.toList());

        pageInfo.setData(repertoryBoList);

        return pageInfo;
    }

    public QueryBuilder queryBuilders(SearchBean sb){
        if(sb==null){
            MatchAllQueryBuilder matchAllQueryBuilder= QueryBuilders.matchAllQuery();
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
        return boolQueryBuilder;
    }


    @Override
    public List<RepertoryBo> searchRepertoryMatch(SearchBean searchBean){
        SearchRequest searchRequest=new SearchRequest();
        //指定索引
        searchRequest.indices("carrepertory");
        HighlightBuilder highlightBuilder=new HighlightBuilder();
        highlightBuilder.field("carName");
        //高亮设置
        highlightBuilder.preTags("<b style='color:red'>");
        highlightBuilder.postTags("</b>");
        SearchSourceBuilder searchSourceBuilder=new SearchSourceBuilder();
        searchSourceBuilder.highlighter(highlightBuilder);

        searchSourceBuilder.query(queryBuilders(searchBean));
        searchSourceBuilder.sort("_id", SortOrder.DESC);
        //指定DSL
        searchRequest.source(searchSourceBuilder);
        List<RepertoryBo> repertoryBoIndexList=null;
        try {
            SearchResponse response = this.esClientConfig.esRestClient().search(searchRequest,EsClientConfig.COMMON_OPTIONS);
            SearchHits hits = response.getHits();
            SearchHit[] hitsHits = hits.getHits();
            repertoryBoIndexList=new ArrayList<>();
            for (SearchHit hitsHit : hitsHits) {
                String sourceAsString = hitsHit.getSourceAsString();
                RepertoryBo repertoryBo= JSONObject.parseObject(sourceAsString,RepertoryBo.class);
                HighlightField highlightField=hitsHit.getHighlightFields().get("carName");
                String highlinghFiled=null;
                if(highlightField!=null){
                    highlinghFiled=highlightField.getFragments()[0].string();
                    repertoryBo.setCarName(highlinghFiled);
                }
                repertoryBoIndexList.add(repertoryBo);
            }
            return repertoryBoIndexList;
        } catch (IOException e) {

            e.printStackTrace();
        }
        return repertoryBoIndexList;
    }
}
