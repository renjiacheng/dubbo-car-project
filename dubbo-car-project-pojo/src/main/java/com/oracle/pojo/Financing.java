package com.oracle.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Financing implements Serializable {
    private Integer financingid;

    private Integer saleid;

    private Integer repertoryid;

    private Integer companyid;

    private BigDecimal financingmoney;

    private String financingtype;

    private Date financingtime;

    private static final long serialVersionUID = 1L;

    public Integer getFinancingid() {
        return financingid;
    }

    public void setFinancingid(Integer financingid) {
        this.financingid = financingid;
    }

    public Integer getSaleid() {
        return saleid;
    }

    public void setSaleid(Integer saleid) {
        this.saleid = saleid;
    }

    public Integer getRepertoryid() {
        return repertoryid;
    }

    public void setRepertoryid(Integer repertoryid) {
        this.repertoryid = repertoryid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public BigDecimal getFinancingmoney() {
        return financingmoney;
    }

    public void setFinancingmoney(BigDecimal financingmoney) {
        this.financingmoney = financingmoney;
    }

    public String getFinancingtype() {
        return financingtype;
    }

    public void setFinancingtype(String financingtype) {
        this.financingtype = financingtype == null ? null : financingtype.trim();
    }

    public Date getFinancingtime() {
        return financingtime;
    }

    public void setFinancingtime(Date financingtime) {
        this.financingtime = financingtime;
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
        Financing other = (Financing) that;
        return (this.getFinancingid() == null ? other.getFinancingid() == null : this.getFinancingid().equals(other.getFinancingid()))
            && (this.getSaleid() == null ? other.getSaleid() == null : this.getSaleid().equals(other.getSaleid()))
            && (this.getRepertoryid() == null ? other.getRepertoryid() == null : this.getRepertoryid().equals(other.getRepertoryid()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getFinancingmoney() == null ? other.getFinancingmoney() == null : this.getFinancingmoney().equals(other.getFinancingmoney()))
            && (this.getFinancingtype() == null ? other.getFinancingtype() == null : this.getFinancingtype().equals(other.getFinancingtype()))
            && (this.getFinancingtime() == null ? other.getFinancingtime() == null : this.getFinancingtime().equals(other.getFinancingtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFinancingid() == null) ? 0 : getFinancingid().hashCode());
        result = prime * result + ((getSaleid() == null) ? 0 : getSaleid().hashCode());
        result = prime * result + ((getRepertoryid() == null) ? 0 : getRepertoryid().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getFinancingmoney() == null) ? 0 : getFinancingmoney().hashCode());
        result = prime * result + ((getFinancingtype() == null) ? 0 : getFinancingtype().hashCode());
        result = prime * result + ((getFinancingtime() == null) ? 0 : getFinancingtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", financingid=").append(financingid);
        sb.append(", saleid=").append(saleid);
        sb.append(", repertoryid=").append(repertoryid);
        sb.append(", companyid=").append(companyid);
        sb.append(", financingmoney=").append(financingmoney);
        sb.append(", financingtype=").append(financingtype);
        sb.append(", financingtime=").append(financingtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}