package com.oracle.annotation;

/**
 * @author HuangHaoD
 * @create 2022/08/22 12:01
 */
public enum LogsType {
    ADD("添加类"),UPDATE("更新类"),DELETE("删除类"),QUERY("查找类");

    private String value;

    LogsType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
