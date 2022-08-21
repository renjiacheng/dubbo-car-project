package com.oracle.pojo.vo;

import java.io.Serializable;

public class CarbrandVo implements Serializable {
    private Integer brandid;

    private String brandname;

    private String brandnum;

    private static final long serialVersionUID = 1L;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getBrandnum() {
        return brandnum;
    }

    public void setBrandnum(String brandnum) {
        this.brandnum = brandnum == null ? null : brandnum.trim();
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
        CarbrandVo other = (CarbrandVo) that;
        return (this.getBrandid() == null ? other.getBrandid() == null : this.getBrandid().equals(other.getBrandid()))
            && (this.getBrandname() == null ? other.getBrandname() == null : this.getBrandname().equals(other.getBrandname()))
            && (this.getBrandnum() == null ? other.getBrandnum() == null : this.getBrandnum().equals(other.getBrandnum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBrandid() == null) ? 0 : getBrandid().hashCode());
        result = prime * result + ((getBrandname() == null) ? 0 : getBrandname().hashCode());
        result = prime * result + ((getBrandnum() == null) ? 0 : getBrandnum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", brandid=").append(brandid);
        sb.append(", brandname=").append(brandname);
        sb.append(", brandnum=").append(brandnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}