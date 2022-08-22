package com.oracle.pojo.dto;

import java.io.Serializable;

/**
 * @author HuangHaoD
 * @create 2022/08/12 16:01
 */
public class ServiceResult<T> implements Serializable {

    public static final Integer SUCCESS_CODE=200;

    public static final Integer SUCCESS_FAIL=201;

    public static final String SUCCESS_MSG="SUCCESS";

    private Integer code;
    private String msg;
    private T data;

    public ServiceResult() {
    }

    public ServiceResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}