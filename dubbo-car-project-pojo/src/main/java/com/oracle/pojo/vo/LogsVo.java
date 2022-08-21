package com.oracle.pojo.vo;

import java.io.Serializable;
import java.util.Date;

public class LogsVo implements Serializable {
    private Integer id;

    private String adminname;

    private String logmethod;

    private String logargs;

    private String logtype;

    private String logip;

    private Float runtime;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getLogmethod() {
        return logmethod;
    }

    public void setLogmethod(String logmethod) {
        this.logmethod = logmethod == null ? null : logmethod.trim();
    }

    public String getLogargs() {
        return logargs;
    }

    public void setLogargs(String logargs) {
        this.logargs = logargs == null ? null : logargs.trim();
    }

    public String getLogtype() {
        return logtype;
    }

    public void setLogtype(String logtype) {
        this.logtype = logtype == null ? null : logtype.trim();
    }

    public String getLogip() {
        return logip;
    }

    public void setLogip(String logip) {
        this.logip = logip == null ? null : logip.trim();
    }

    public Float getRuntime() {
        return runtime;
    }

    public void setRuntime(Float runtime) {
        this.runtime = runtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        LogsVo other = (LogsVo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAdminname() == null ? other.getAdminname() == null : this.getAdminname().equals(other.getAdminname()))
            && (this.getLogmethod() == null ? other.getLogmethod() == null : this.getLogmethod().equals(other.getLogmethod()))
            && (this.getLogargs() == null ? other.getLogargs() == null : this.getLogargs().equals(other.getLogargs()))
            && (this.getLogtype() == null ? other.getLogtype() == null : this.getLogtype().equals(other.getLogtype()))
            && (this.getLogip() == null ? other.getLogip() == null : this.getLogip().equals(other.getLogip()))
            && (this.getRuntime() == null ? other.getRuntime() == null : this.getRuntime().equals(other.getRuntime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAdminname() == null) ? 0 : getAdminname().hashCode());
        result = prime * result + ((getLogmethod() == null) ? 0 : getLogmethod().hashCode());
        result = prime * result + ((getLogargs() == null) ? 0 : getLogargs().hashCode());
        result = prime * result + ((getLogtype() == null) ? 0 : getLogtype().hashCode());
        result = prime * result + ((getLogip() == null) ? 0 : getLogip().hashCode());
        result = prime * result + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adminname=").append(adminname);
        sb.append(", logmethod=").append(logmethod);
        sb.append(", logargs=").append(logargs);
        sb.append(", logtype=").append(logtype);
        sb.append(", logip=").append(logip);
        sb.append(", runtime=").append(runtime);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}