package com.oracle.customer;

import com.alibaba.fastjson.JSON;
import com.oracle.car.service.api.CarOrderServiceApi;
import com.oracle.pojo.Carorder;
import com.oracle.repertory.service.api.RepertoryServiceApi;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author HuangHaoD
 * @create 2022/08/22 20:49
 */
@Component
public class OrderConsumer implements MessageListener {
    @Autowired
    private CarOrderServiceApi carOrderServiceApi;
    @Autowired
    private RepertoryServiceApi repertoryServiceApi;

    @Override
    public void onMessage(Message message) {
        byte[] body = message.getBody();
        Carorder carorder= JSON.parseObject(body, Carorder.class);
        String byOrderType = this.carOrderServiceApi.findByOrderType(carorder.getOrderid());
        if ("1".equals(byOrderType)){

        }
    }
}