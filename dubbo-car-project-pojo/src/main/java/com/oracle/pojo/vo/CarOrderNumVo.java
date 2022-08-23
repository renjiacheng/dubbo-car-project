package com.oracle.pojo.vo;

/**
 * @author HuangHaoD
 * @create 2022/08/23 10:49
 */
public class CarOrderNumVo {

    private String carName;
    private Integer OrderNum;

    public CarOrderNumVo() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Integer getOrderNum() {
        return OrderNum;
    }

    public void setOrderNum(Integer orderNum) {
        OrderNum = orderNum;
    }
}