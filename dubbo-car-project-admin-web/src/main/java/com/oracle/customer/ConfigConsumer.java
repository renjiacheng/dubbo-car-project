package com.oracle.customer;

import com.alibaba.fastjson.JSON;
import com.oracle.config.service.api.ConfigServiceApi;
import com.oracle.pojo.dto.ServiceResult;
import com.oracle.pojo.vo.SystemconfigVo;
import com.oracle.utils.PropertiesUtils;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/22 20:51
 */
@Component
public class ConfigConsumer implements MessageListener {

    @Autowired
    private ConfigServiceApi configServiceApi;
    @Autowired
    private PropertiesUtils propertiesUtils;
    @Override
    public void onMessage(Message message) {
        byte[] body = message.getBody();
        ServiceResult object = JSON.parseObject(body, ServiceResult.class);
        if (object.getCode().equals(200)){
            ServiceResult<List<SystemconfigVo>> systemConfigList = configServiceApi.getSystemConfigList();
            propertiesUtils.refLocalConfig(systemConfigList.getData());
        }
    }
}