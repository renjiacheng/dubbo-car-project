package com.oracle.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Repertory implements Serializable {
    private Integer repertoryid;

    private Integer carid;

    private Integer companyid;

    private BigDecimal purchaseprice;

    private Date intime;

    private Integer repertorynum;

    private static final long serialVersionUID = 1L;

    public Integer getRepertoryid() {
        return repertoryid;
    }

    public void setRepertoryid(Integer repertoryid) {
        this.repertoryid = repertoryid;
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

    public BigDecimal getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(BigDecimal purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Integer getRepertorynum() {
        return repertorynum;
    }

    public void setRepertorynum(Integer repertorynum) {
        this.repertorynum = repertorynum;
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
        Repertory other = (Repertory) that;
        return (this.getRepertoryid() == null ? other.getRepertoryid() == null : this.getRepertoryid().equals(other.getRepertoryid()))
            && (this.getCarid() == null ? other.getCarid() == null : this.getCarid().equals(other.getCarid()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getPurchaseprice() == null ? other.getPurchaseprice() == null : this.getPurchaseprice().equals(other.getPurchaseprice()))
            && (this.getIntime() == null ? other.getIntime() == null : this.getIntime().equals(other.getIntime()))
            && (this.getRepertorynum() == null ? other.getRepertorynum() == null : this.getRepertorynum().equals(other.getRepertorynum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRepertoryid() == null) ? 0 : getRepertoryid().hashCode());
        result = prime * result + ((getCarid() == null) ? 0 : getCarid().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getPurchaseprice() == null) ? 0 : getPurchaseprice().hashCode());
        result = prime * result + ((getIntime() == null) ? 0 : getIntime().hashCode());
        result = prime * result + ((getRepertorynum() == null) ? 0 : getRepertorynum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repertoryid=").append(repertoryid);
        sb.append(", carid=").append(carid);
        sb.append(", companyid=").append(companyid);
        sb.append(", purchaseprice=").append(purchaseprice);
        sb.append(", intime=").append(intime);
        sb.append(", repertorynum=").append(repertorynum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}