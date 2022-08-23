package com.oracle.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * @author ltcstart
 * @date 2022/7/21 - 16:03
 */
@Component
public class InitiaListener implements ServletContextAware, ApplicationListener<ContextRefreshedEvent> {

    /**
     *     ContextRefreshedEvent:上下文更新事件
     */
    private ServletContext servletContext;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
            servletContext.setAttribute("root",servletContext.getContextPath());
            servletContext.setAttribute("css",servletContext.getContextPath()+"/resources/css");
            servletContext.setAttribute("image",servletContext.getContextPath()+"/resources/images");
            servletContext.setAttribute("js",servletContext.getContextPath()+"/resources/js");
            servletContext.setAttribute("kindeditor",servletContext.getContextPath()+"/resources/kindeditor");
        }


    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext=servletContext;
    }
}
