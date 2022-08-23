package com.oracle.repertory.service.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ltcstart
 * @date 2022/8/19 - 15:47
 */
@Component
public class EsClientConfig {

    //请求设置项
    public static final RequestOptions COMMON_OPTIONS;
    static {
        //基于默认规则设置
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
        COMMON_OPTIONS = builder.build();
    }

    @Bean
    public RestHighLevelClient esRestClient(){
        RestHighLevelClient client=new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.80.140",9200,"http")
                )
        );
        return client;
    }
}