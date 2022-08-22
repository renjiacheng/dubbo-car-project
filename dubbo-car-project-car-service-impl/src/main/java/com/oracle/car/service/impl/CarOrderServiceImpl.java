package com.oracle.car.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.oracle.car.service.api.CarOrderServiceApi;
import com.oracle.mapper.CarorderMapper;
import com.oracle.pojo.Carorder;
import com.oracle.pojo.vo.CarorderVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author HuangHaoD
 * @create 2022/08/22 14:43
 */
@Service
public class CarOrderServiceImpl implements CarOrderServiceApi {

    @Autowired
    private CarorderMapper carorderMapper;

    @Override
    public int insertCarOrder(CarorderVo carorderVo) {
        Carorder carorder=new Carorder();
        BeanUtils.copyProperties(carorderVo,carorder);
        this.carorderMapper.insert(carorder);
        return 0;
    }

    @Override
    public int updateCarOrder(CarorderVo carorderVo) {
        Carorder carorder=new Carorder();
        BeanUtils.copyProperties(carorderVo,carorder);
        this.carorderMapper.updateByPrimaryKey(carorder);
        return 0;
    }

    @Override
    public int updateCarType(Integer id) {
        Carorder carorder=new Carorder();
        carorder.setCarid(id);
        carorder.setOrdertype("1");
        this.carorderMapper.updateByPrimaryKeySelective(carorder);
        return 0;
    }
}