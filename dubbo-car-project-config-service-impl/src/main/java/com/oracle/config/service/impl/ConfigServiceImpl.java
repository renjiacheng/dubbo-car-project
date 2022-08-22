package com.oracle.config.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.oracle.config.service.api.ConfigServiceApi;
import com.oracle.mapper.SystemconfigMapper;
import com.oracle.pojo.Systemconfig;
import com.oracle.pojo.dto.ServiceResult;
import com.oracle.pojo.vo.SystemconfigVo;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author HuangHaoD
 * @create 2022/08/22 14:22
 */
@Service
public class ConfigServiceImpl implements ConfigServiceApi {

    @Autowired
    private SystemconfigMapper systemconfigMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;


    @Override
    public ServiceResult<List<SystemconfigVo>> getSystemConfigList() {
        List<Systemconfig> systemconfigList = this.systemconfigMapper.selectByExample(null);
        List<SystemconfigVo> systemconfigVoList = systemconfigList.stream().map(systemconfig -> {
            SystemconfigVo systemconfigVo = new SystemconfigVo();
            BeanUtils.copyProperties(systemconfig, systemconfigVo);
            return systemconfigVo;
        }).collect(Collectors.toList());
        return new ServiceResult<>(ServiceResult.SUCCESS_CODE,ServiceResult.SUCCESS_MSG,systemconfigVoList);
    }

    @Override
    public ServiceResult updateSystemConfigById(SystemconfigVo systemconfigVo) {
        Systemconfig systemconfig=new Systemconfig();
        BeanUtils.copyProperties(systemconfigVo,systemconfig);
        this.systemconfigMapper.updateByPrimaryKeySelective(systemconfig);
        ServiceResult serviceResult = new ServiceResult(ServiceResult.SUCCESS_CODE, ServiceResult.SUCCESS_MSG, null);
        amqpTemplate.convertAndSend("springConfigExchange","config",serviceResult);
        return serviceResult;
    }

    @Override
    public ServiceResult defaultSystemConfig(Integer id) {
        Systemconfig systemconfig = this.systemconfigMapper.selectByPrimaryKey(id);
        Systemconfig systemconfig1=new Systemconfig();
        systemconfig1.setConfigvalue(Integer.valueOf(systemconfig.getDefaultvalue()));
        this.systemconfigMapper.updateByPrimaryKeySelective(systemconfig1);
        ServiceResult serviceResult = new ServiceResult(ServiceResult.SUCCESS_CODE, ServiceResult.SUCCESS_MSG, null);
        amqpTemplate.convertAndSend("springConfigExchange","config",serviceResult);
        return serviceResult;
    }

    @Override
    public ServiceResult defaultSystemConfig() {
        List<Systemconfig> systemconfigList = this.systemconfigMapper.selectByExample(null);
        for (Systemconfig systemconfig : systemconfigList) {
            Systemconfig systemconfig1=new Systemconfig();
            systemconfig1.setConfigvalue(Integer.valueOf(systemconfig.getDefaultvalue()));
            systemconfig1.setId(systemconfig.getId());
            this.systemconfigMapper.updateByPrimaryKeySelective(systemconfig1);
        }
        ServiceResult serviceResult = new ServiceResult(ServiceResult.SUCCESS_CODE, ServiceResult.SUCCESS_MSG, null);
        amqpTemplate.convertAndSend("springConfigExchange","config",serviceResult);
        return serviceResult;
    }

    @Override
    public ServiceResult getSystemConfigById(Integer id) {
        Systemconfig systemconfig = this.systemconfigMapper.selectByPrimaryKey(id);
        ServiceResult serviceResult = new ServiceResult(ServiceResult.SUCCESS_CODE, ServiceResult.SUCCESS_MSG, systemconfig);
        return serviceResult;
    }
}