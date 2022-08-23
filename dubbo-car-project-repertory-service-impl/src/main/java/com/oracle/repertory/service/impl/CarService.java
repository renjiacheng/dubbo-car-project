package com.oracle.repertory.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.oracle.config.RedisConfig;
import com.oracle.mapper.CarMapper;
import com.oracle.mapper.CarbrandMapper;
import com.oracle.mapper.CarseriesMapper;
import com.oracle.pojo.*;
import com.oracle.pojo.vo.CarVo;
import com.oracle.pojo.vo.CarbrandVo;
import com.oracle.pojo.vo.CarseriesVo;
import com.oracle.repertory.service.api.CarServiceApi;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ltcstart
 * @date 2022/8/22 - 13:53
 */
@Log4j
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
        String key = this.redisConfig.getRedisPrefix() + "carBrand:list";
        String jsonStr = (String) this.redisTemplate.boundValueOps(key + "").get();
        if (jsonStr != null) {
            List<CarbrandVo> carbrandVoList = JSON.parseArray(jsonStr + "", CarbrandVo.class);
            return carbrandVoList;
        }

        List<Carbrand> carbrandList = carbrandMapper.selectByExample(null);
        List<CarbrandVo> carbrandVoList = carbrandList.stream().map(carBrandPo -> {
            CarbrandVo carbrandVo = new CarbrandVo();
            BeanUtils.copyProperties(carBrandPo, carbrandVo);
            return carbrandVo;
        }).collect(Collectors.toList());
        jsonStr = JSON.toJSONString(carbrandVoList);
        this.redisTemplate.boundValueOps(key + "").set(jsonStr);
        return carbrandVoList;
    }

    @Override
    public List<CarseriesVo> findCarseriesListByBrandId(Integer brandId) {
        String key = this.redisConfig.getRedisPrefix() + "carSeries:list";
        String jsonStr = (String) this.redisTemplate.boundValueOps(key + "").get();
        if (jsonStr != null) {
            List<CarseriesVo> carseriesVoList = JSON.parseArray(jsonStr + "", CarseriesVo.class);
            return carseriesVoList;
        }
        CarseriesExample carseriesExample = new CarseriesExample();
        carseriesExample.createCriteria().andBrandidEqualTo(brandId);
        List<Carseries> carseries = this.carseriesMapper.selectByExample(carseriesExample);
        List<CarseriesVo> carseriesVos = carseries.stream().map(carseriesPo -> {
            CarseriesVo carseriesVo = new CarseriesVo();
            BeanUtils.copyProperties(carseriesPo, carseriesVo);
            return carseriesVo;
        }).collect(Collectors.toList());
        //存进redis
        jsonStr = JSON.toJSONString(carseriesVos);
        this.redisTemplate.boundValueOps(key + "").set(jsonStr);
        return carseriesVos;
    }

    @Override
    public List<CarVo> findCarListBySeriesId(Integer seriesId) {
        String key = this.redisConfig.getRedisPrefix() + "car:list";
        String jsonStr = (String) this.redisTemplate.boundValueOps(key + "").get();
        if (jsonStr!=null){
            log.info("走了redis里面查找");
            List<CarVo> carVos = JSON.parseArray(jsonStr + "", CarVo.class);
            return carVos;
        }
        log.info("走了mysql数据库里面查找");
        CarExample carExample = new CarExample();
        carExample.createCriteria().andSeriesidEqualTo(seriesId);
        List<Car> cars = this.carMapper.selectByExample(carExample);
        List<CarVo> carVoList = cars.stream().map(carPo -> {
            CarVo carVo = new CarVo();
            BeanUtils.copyProperties(carPo, carVo);
            return carVo;
        }).collect(Collectors.toList());
        jsonStr= JSON.toJSONString(carVoList);
        this.redisTemplate.boundValueOps(key+"").set(jsonStr);
        return carVoList;
    }
}
