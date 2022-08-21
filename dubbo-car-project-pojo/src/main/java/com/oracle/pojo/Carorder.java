package com.oracle.pojo;


import java.io.Serializable;
import java.math.BigDecimal;

public class Carorder implements Serializable {
    private Integer orderid;

    private Integer carid;

    private Integer companyid;

    private Integer ordernum;

    private String ordertype;

    private BigDecimal ordertotalprice;

    private static final long serialVersionUID = 1L;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }

    public BigDecimal getOrdertotalprice() {
        return ordertotalprice;
    }

    public void setOrdertotalprice(BigDecimal ordertotalprice) {
        this.ordertotalprice = ordertotalprice;
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
        Carorder other = (Carorder) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getCarid() == null ? other.getCarid() == null : this.getCarid().equals(other.getCarid()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getOrdernum() == null ? other.getOrdernum() == null : this.getOrdernum().equals(other.getOrdernum()))
            && (this.getOrdertype() == null ? other.getOrdertype() == null : this.getOrdertype().equals(other.getOrdertype()))
            && (this.getOrdertotalprice() == null ? other.getOrdertotalprice() == null : this.getOrdertotalprice().equals(other.getOrdertotalprice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getCarid() == null) ? 0 : getCarid().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getOrdernum() == null) ? 0 : getOrdernum().hashCode());
        result = prime * result + ((getOrdertype() == null) ? 0 : getOrdertype().hashCode());
        result = prime * result + ((getOrdertotalprice() == null) ? 0 : getOrdertotalprice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", carid=").append(carid);
        sb.append(", companyid=").append(companyid);
        sb.append(", ordernum=").append(ordernum);
        sb.append(", ordertype=").append(ordertype);
        sb.append(", ordertotalprice=").append(ordertotalprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}