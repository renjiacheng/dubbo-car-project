package com.oracle.pojo;

import java.io.Serializable;

public class Permissions implements Serializable {
    private Integer id;

    private String permissionname;

    private String permissionurl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }

    public String getPermissionurl() {
        return permissionurl;
    }

    public void setPermissionurl(String permissionurl) {
        this.permissionurl = permissionurl == null ? null : permissionurl.trim();
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
        Permissions other = (Permissions) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPermissionname() == null ? other.getPermissionname() == null : this.getPermissionname().equals(other.getPermissionname()))
            && (this.getPermissionurl() == null ? other.getPermissionurl() == null : this.getPermissionurl().equals(other.getPermissionurl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPermissionname() == null) ? 0 : getPermissionname().hashCode());
        result = prime * result + ((getPermissionurl() == null) ? 0 : getPermissionurl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", permissionname=").append(permissionname);
        sb.append(", permissionurl=").append(permissionurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}