package com.oracle.car.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.oracle.car.service.api.CarOrderServiceApi;
import com.oracle.mapper.CarorderMapper;
import com.oracle.pojo.Carorder;
import com.oracle.pojo.vo.CarOrderNumVo;
import com.oracle.pojo.vo.CarorderVo;
import com.oracle.repertory.service.api.RepertoryServiceApi;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/22 14:43
 */
@Service
public class CarOrderServiceImpl implements CarOrderServiceApi {

    @Autowired
    private CarorderMapper carorderMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Autowired
    private RepertoryServiceApi repertoryServiceApi;


    @Override
    public void insertCarOrder(CarorderVo carorderVo) {
        Carorder carorder=new Carorder();
        BeanUtils.copyProperties(carorderVo,carorder);
        this.carorderMapper.insert(carorder);
        repertoryServiceApi.updateRepertoryNum(carorder.getCarid(),-carorder.getOrdernum());
        amqpTemplate.convertAndSend("springOrderExchange","order",carorderVo.getOrderid());
    }

    @Override
    public void updateCarOrder(CarorderVo carorderVo) {
        Carorder carorder=new Carorder();
        BeanUtils.copyProperties(carorderVo,carorder);
        this.carorderMapper.updateByPrimaryKey(carorder);
    }

    @Override
    public void updateCarType(Integer id) {
        Carorder carorder=new Carorder();
        carorder.setCarid(id);
        carorder.setOrdertype("1");
        this.carorderMapper.updateByPrimaryKeySelective(carorder);
    }

    @Override
    public CarorderVo  findByOrderType(Integer id) {
        Carorder carorder = this.carorderMapper.selectByPrimaryKey(id);
        CarorderVo carorderVo=new CarorderVo();
        BeanUtils.copyProperties(carorder,carorderVo);
        return carorderVo;
    }

    @Override
    public List<CarOrderNumVo> getList() {
        List<CarOrderNumVo> carOrderNumVos = this.carorderMapper.selectAll();
        return carOrderNumVos;
    }


}