package com.oracle.pojo.vo;

import com.oracle.pojo.Systemconfig;

import java.io.Serializable;
import java.util.Date;

public class SystemconfigVo implements Serializable {
    private Integer id;

    private String configname;

    private Integer configvalue;

    private String configdesc;

    private Date createdate;

    private Date modifydate;

    private String defaultvalue;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConfigname() {
        return configname;
    }

    public void setConfigname(String configname) {
        this.configname = configname == null ? null : configname.trim();
    }

    public Integer getConfigvalue() {
        return configvalue;
    }

    public void setConfigvalue(Integer configvalue) {
        this.configvalue = configvalue;
    }

    public String getConfigdesc() {
        return configdesc;
    }

    public void setConfigdesc(String configdesc) {
        this.configdesc = configdesc == null ? null : configdesc.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue == null ? null : defaultvalue.trim();
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
        Systemconfig other = (Systemconfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConfigname() == null ? other.getConfigname() == null : this.getConfigname().equals(other.getConfigname()))
            && (this.getConfigvalue() == null ? other.getConfigvalue() == null : this.getConfigvalue().equals(other.getConfigvalue()))
            && (this.getConfigdesc() == null ? other.getConfigdesc() == null : this.getConfigdesc().equals(other.getConfigdesc()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getDefaultvalue() == null ? other.getDefaultvalue() == null : this.getDefaultvalue().equals(other.getDefaultvalue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConfigname() == null) ? 0 : getConfigname().hashCode());
        result = prime * result + ((getConfigvalue() == null) ? 0 : getConfigvalue().hashCode());
        result = prime * result + ((getConfigdesc() == null) ? 0 : getConfigdesc().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getDefaultvalue() == null) ? 0 : getDefaultvalue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", configname=").append(configname);
        sb.append(", configvalue=").append(configvalue);
        sb.append(", configdesc=").append(configdesc);
        sb.append(", createdate=").append(createdate);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", defaultvalue=").append(defaultvalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}