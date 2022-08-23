package com.oracle.log.service.impl;

import com.alibaba.fastjson.JSON;
import com.oracle.log.service.api.LogServiceApi;
import com.oracle.pojo.vo.LogsVo;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author HuangHaoD
 * @create 2022/08/23 8:59
 */
@Component
public class LogConsumer implements MessageListener {

    @Autowired
    private LogServiceApi logServiceApi;


    @Override
    public void onMessage(Message message) {
        byte[] body = message.getBody();
        LogsVo logsVo = JSON.parseObject(body, LogsVo.class);
        this.logServiceApi.addLog(logsVo);
    }
}