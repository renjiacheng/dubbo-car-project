package com.oracle.utils;

import com.oracle.pojo.vo.SystemconfigVo;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * @author HuangHaoD
 * @create 2022/08/14 18:22
 */
public class PropertiesUtils {

    private Properties properties=new Properties();


    public void loadProperties(){
        try {
            properties.load(PropertiesUtils.class.getResourceAsStream("/properties/admin.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object getValue(String key){
       return properties.getProperty(key);
    }

    public void setValue(String key,String value){
        properties.setProperty(key,value);
    }


    public void refLocalConfig(List<SystemconfigVo> systemconfigVoList){
        for (int i = 0; i < systemconfigVoList.size(); i++) {
            setValue(systemconfigVoList.get(i).getConfigname(), String.valueOf(systemconfigVoList.get(i).getConfigvalue()));
        }
    }
}