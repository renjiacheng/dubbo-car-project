package com.oracle.config.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.oracle.config.service.api.ConfigServiceApi;
import com.oracle.mapper.CarbrandMapper;
import com.oracle.mapper.SystemconfigMapper;
import com.oracle.pojo.dto.ServiceResult;
import com.oracle.pojo.vo.SystemconfigVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/22 14:22
 */
@Service
public class ConfigServiceImpl implements ConfigServiceApi {

    @Autowired
    private SystemconfigMapper systemconfigMapper;

    @Autowired
    private CarbrandMapper carbrandMapper;


    @Override
    public ServiceResult<List<SystemconfigVo>> getSystemConfigList() {

        return null;
    }

    @Override
    public ServiceResult updateSystemConfigById(SystemconfigVo systemconfigVo) {
        return null;
    }

    @Override
    public ServiceResult defaultSystemConfig(Integer id) {
        return null;
    }

    @Override
    public ServiceResult defaultSystemConfig() {
        return null;
    }

    @Override
    public ServiceResult getSystemConfigById(Integer id) {
        return null;
    }
}