package com.oracle.pojo.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ltcstart
 * @date 2022/8/22 - 15:36
 */
public class RepertoryBo {
    private Integer repertoryId;
    private String carName;
    private String companyName;
    private BigDecimal purchasePrice;
    private Date inTime;
    private Integer repertoryNum;

    public RepertoryBo() {
    }

    public RepertoryBo(Integer repertoryId, String carName, String companyName, BigDecimal purchasePrice, Date inTime, Integer repertoryNum) {
        this.repertoryId = repertoryId;
        this.carName = carName;
        this.companyName = companyName;
        this.purchasePrice = purchasePrice;
        this.inTime = inTime;
        this.repertoryNum = repertoryNum;
    }

    public Integer getRepertoryId() {
        return repertoryId;
    }

    public void setRepertoryId(Integer repertoryId) {
        this.repertoryId = repertoryId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Integer getRepertoryNum() {
        return repertoryNum;
    }

    public void setRepertoryNum(Integer repertoryNum) {
        this.repertoryNum = repertoryNum;
    }

    @Override
    public String toString() {
        return "RepertoryBo{" +
                "repertoryId=" + repertoryId +
                ", carName='" + carName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", inTime=" + inTime +
                ", repertoryNum=" + repertoryNum +
                '}';
    }
}
