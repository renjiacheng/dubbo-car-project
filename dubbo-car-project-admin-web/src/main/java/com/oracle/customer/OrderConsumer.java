package com.oracle.customer;

import com.alibaba.fastjson.JSON;
import com.oracle.car.service.api.CarOrderServiceApi;
import com.oracle.pojo.Carorder;
import com.oracle.pojo.vo.CarorderVo;
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
    @Autowired(required = false)
    private CarOrderServiceApi carOrderServiceApi;
    @Autowired(required = false)
    private RepertoryServiceApi repertoryServiceApi;

    @Override
    public void onMessage(Message message) {
        byte[] body = message.getBody();
        Integer carorderId= JSON.parseObject(body, Integer.class);
        CarorderVo carorderVo = this.carOrderServiceApi.findByOrderType(carorderId);
        if ("1".equals(carorderVo.getOrdertype())){
            this.repertoryServiceApi.updateRepertoryNum(carorderId,+carorderVo.getOrdernum());
        }
    }
}