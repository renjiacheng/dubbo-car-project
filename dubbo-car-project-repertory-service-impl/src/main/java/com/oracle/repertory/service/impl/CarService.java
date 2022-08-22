package com.oracle.repertory.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.oracle.config.RedisConfig;
import com.oracle.mapper.CarMapper;
import com.oracle.mapper.CarbrandMapper;
import com.oracle.mapper.CarseriesMapper;
import com.oracle.pojo.Carbrand;
import com.oracle.pojo.Carseries;
import com.oracle.pojo.vo.CarVo;
import com.oracle.pojo.vo.CarbrandVo;
import com.oracle.pojo.vo.CarseriesVo;
import com.oracle.repertory.service.api.CarServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * @author ltcstart
 * @date 2022/8/22 - 13:53
 */
@Service
public class CarService implements CarServiceApi {


    @Autowired
    private RedisConfig redisConfig;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private CarbrandMapper carbrandMapper;
    @Autowired
    private CarseriesMapper carseriesMapper;
    @Autowired
    private CarMapper carMapper;

    @Override
    public List<CarbrandVo> findCarBrandList() {
        String key=this.redisConfig.getRedisPrefix()+"carBrand:list";
        String jsonStr = (String) this.redisTemplate.boundValueOps(key+"").get();
        if (jsonStr!=null){
            List<CarbrandVo> carbrandVoList = JSON.parseArray(jsonStr + "", CarbrandVo.class);
            return carbrandVoList;
        }


        return null;
    }

    @Override
    public List<CarseriesVo> findCarseriesListByBrandId(Integer brandId) {
        return null;
    }

    @Override
    public List<CarVo> findCarListBySeriesId(Integer seriesId) {
        return null;
    }
}
