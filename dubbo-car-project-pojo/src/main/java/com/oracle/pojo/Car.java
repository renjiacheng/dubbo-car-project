package com.oracle.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Car implements Serializable {
    private Integer carid;

    private Integer seriesid;

    private String carname;

    private BigDecimal carprice;

    private Date cartime;

    private static final long serialVersionUID = 1L;

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(Integer seriesid) {
        this.seriesid = seriesid;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname == null ? null : carname.trim();
    }

    public BigDecimal getCarprice() {
        return carprice;
    }

    public void setCarprice(BigDecimal carprice) {
        this.carprice = carprice;
    }

    public Date getCartime() {
        return cartime;
    }

    public void setCartime(Date cartime) {
        this.cartime = cartime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Car other = (Car) that;
        return (this.getCarid() == null ? other.getCarid() == null : this.getCarid().equals(other.getCarid()))
            && (this.getSeriesid() == null ? other.getSeriesid() == null : this.getSeriesid().equals(other.getSeriesid()))
            && (this.getCarname() == null ? other.getCarname() == null : this.getCarname().equals(other.getCarname()))
            && (this.getCarprice() == null ? other.getCarprice() == null : this.getCarprice().equals(other.getCarprice()))
            && (this.getCartime() == null ? other.getCartime() == null : this.getCartime().equals(other.getCartime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarid() == null) ? 0 : getCarid().hashCode());
        result = prime * result + ((getSeriesid() == null) ? 0 : getSeriesid().hashCode());
        result = prime * result + ((getCarname() == null) ? 0 : getCarname().hashCode());
        result = prime * result + ((getCarprice() == null) ? 0 : getCarprice().hashCode());
        result = prime * result + ((getCartime() == null) ? 0 : getCartime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carid=").append(carid);
        sb.append(", seriesid=").append(seriesid);
        sb.append(", carname=").append(carname);
        sb.append(", carprice=").append(carprice);
        sb.append(", cartime=").append(cartime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}