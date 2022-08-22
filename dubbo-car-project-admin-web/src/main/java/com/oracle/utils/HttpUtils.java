package com.oracle.utils;
/*
 * company:
 * @Author: zhaoran
 * @Date: 2019/7/22 18:12
 * @version: 1.0
 * */

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class HttpUtils {

    public static HttpServletRequest getHttpServletRequest(){
        return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
    }
}
