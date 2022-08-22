package com.oracle.aspect;

import com.alibaba.fastjson.JSON;
import com.oracle.annotation.Logs;
import com.oracle.log.service.api.LogServiceApi;
import com.oracle.pojo.vo.LogsVo;
import com.oracle.utils.HttpUtils;
import com.oracle.utils.IPUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author HuangHaoD
 * @create 2022/08/22 15:01
 */
@Aspect
@Component
public class LosAspect {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private LogServiceApi logServiceApi;

    @Pointcut("@annotation(com.oracle.annotation.Logs)")
    public void pointCut(){
    }

    @Around("pointCut()")
    public Object AddLog(ProceedingJoinPoint pjp){
        LogsVo logsVo=new LogsVo();
        //获取目标对象
        String simpleName = pjp.getTarget().getClass().getSimpleName();
        //获取方法签名
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method method = methodSignature.getMethod();
        String name = method.getName();
        logsVo.setLogmethod(simpleName+":::"+method);
        //获取参数
        Object[] args = pjp.getArgs();
        if (ObjectUtils.isEmpty(args)){
            String jsonString = JSON.toJSONString(args);
            logsVo.setLogargs(jsonString);
        }
        String value = method.getAnnotation(Logs.class).value().getValue();
        logsVo.setLogtype(value);
        HttpServletRequest httpServletRequest = HttpUtils.getHttpServletRequest();
        String ipAddr = IPUtils.getIpAddr(httpServletRequest);
        logsVo.setLogip(ipAddr);
        Object object=null;
        try {
            long start = System.currentTimeMillis();
            object= pjp.proceed();
            long end = System.currentTimeMillis();
            logsVo.setRuntime((float)(end-start)/1000);
            logsVo.setCreatetime(new Date());
            return object;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }finally {
            amqpTemplate.convertAndSend("springLogExchange","log",logsVo);
        }

        return null;
    }
}