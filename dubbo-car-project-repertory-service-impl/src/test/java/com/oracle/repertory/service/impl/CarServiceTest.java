package com.oracle.repertory.service.impl;

import com.oracle.config.RedisConfig;
import com.oracle.mapper.CarbrandMapper;
import com.oracle.mapper.RepertoryMapper;
import com.oracle.pojo.Carbrand;
import com.oracle.pojo.vo.CarVo;
import com.oracle.pojo.vo.CarbrandVo;
import com.oracle.pojo.vo.CarseriesVo;
import com.oracle.pojo.vo.RepertoryBo;
import com.oracle.repertory.service.api.CarServiceApi;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * @author ltcstart
 * @date 2022/8/22 - 14:36
 */
public class CarServiceTest extends BaseTest{

    @Autowired(required = false)
    private CarServiceApi carServiceApi;

    @Autowired(required = false)
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisConfig redisConfig;

    @Autowired
    private RepertoryMapper repertoryMapper;

    @Test
    public void findCarBrandListTest(){
        List<CarbrandVo> carBrandList = this.carServiceApi.findCarBrandList();
        System.out.println(carBrandList);
    }

    @Test
    public void findCarseriesListByBrandIdTest(){
        List<CarseriesVo> voList = this.carServiceApi.findCarseriesListByBrandId(1);
        System.out.println(voList);
    }

    @Test
    public void findCarListBySeriesId(){
        List<CarVo> carListBySeriesId = this.carServiceApi.findCarListBySeriesId(1);
        System.out.println(carListBySeriesId);
    }

    @Test
    public void test1(){
        List<RepertoryBo> repertoryBos = this.repertoryMapper.findallRepertory();
        System.out.println(repertoryBos);
    }
}
