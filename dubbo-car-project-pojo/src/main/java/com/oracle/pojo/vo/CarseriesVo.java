package com.oracle.pojo.vo;

import java.io.Serializable;

public class CarseriesVo implements Serializable {
    private Integer seriesid;

    private Integer brandid;

    private String seriesname;

    private static final long serialVersionUID = 1L;

    public Integer getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(Integer seriesid) {
        this.seriesid = seriesid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getSeriesname() {
        return seriesname;
    }

    public void setSeriesname(String seriesname) {
        this.seriesname = seriesname == null ? null : seriesname.trim();
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
        CarseriesVo other = (CarseriesVo) that;
        return (this.getSeriesid() == null ? other.getSeriesid() == null : this.getSeriesid().equals(other.getSeriesid()))
            && (this.getBrandid() == null ? other.getBrandid() == null : this.getBrandid().equals(other.getBrandid()))
            && (this.getSeriesname() == null ? other.getSeriesname() == null : this.getSeriesname().equals(other.getSeriesname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeriesid() == null) ? 0 : getSeriesid().hashCode());
        result = prime * result + ((getBrandid() == null) ? 0 : getBrandid().hashCode());
        result = prime * result + ((getSeriesname() == null) ? 0 : getSeriesname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seriesid=").append(seriesid);
        sb.append(", brandid=").append(brandid);
        sb.append(", seriesname=").append(seriesname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}