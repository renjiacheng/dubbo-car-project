package com.oracle.pojo.vo;

/**
 * @author ltcstart
 * @date 2022/8/19 - 19:21
 */
public class SearchBean {
    private String carName;
    private String companyName;


    public SearchBean() {
    }

    public SearchBean(String carName, String companyName) {
        this.carName = carName;
        this.companyName = companyName;
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

    @Override
    public String toString() {
        return "SearchBean{" +
                "carName='" + carName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
