package com.oracle.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee implements Serializable {
    private Integer empid;

    private Integer positionid;

    private Integer companyid;

    private String empname;

    private String empphone;

    private String emppassword;

    private BigDecimal empsalery;

    private Company company;

    private Roles roles;

    private static final long serialVersionUID = 1L;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone == null ? null : empphone.trim();
    }

    public String getEmppassword() {
        return emppassword;
    }

    public void setEmppassword(String emppassword) {
        this.emppassword = emppassword == null ? null : emppassword.trim();
    }

    public BigDecimal getEmpsalery() {
        return empsalery;
    }

    public void setEmpsalery(BigDecimal empsalery) {
        this.empsalery = empsalery;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
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
        Employee other = (Employee) that;
        return (this.getEmpid() == null ? other.getEmpid() == null : this.getEmpid().equals(other.getEmpid()))
            && (this.getPositionid() == null ? other.getPositionid() == null : this.getPositionid().equals(other.getPositionid()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getEmpname() == null ? other.getEmpname() == null : this.getEmpname().equals(other.getEmpname()))
            && (this.getEmpphone() == null ? other.getEmpphone() == null : this.getEmpphone().equals(other.getEmpphone()))
            && (this.getEmppassword() == null ? other.getEmppassword() == null : this.getEmppassword().equals(other.getEmppassword()))
            && (this.getEmpsalery() == null ? other.getEmpsalery() == null : this.getEmpsalery().equals(other.getEmpsalery()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpid() == null) ? 0 : getEmpid().hashCode());
        result = prime * result + ((getPositionid() == null) ? 0 : getPositionid().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getEmpname() == null) ? 0 : getEmpname().hashCode());
        result = prime * result + ((getEmpphone() == null) ? 0 : getEmpphone().hashCode());
        result = prime * result + ((getEmppassword() == null) ? 0 : getEmppassword().hashCode());
        result = prime * result + ((getEmpsalery() == null) ? 0 : getEmpsalery().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empid=").append(empid);
        sb.append(", positionid=").append(positionid);
        sb.append(", companyid=").append(companyid);
        sb.append(", empname=").append(empname);
        sb.append(", empphone=").append(empphone);
        sb.append(", emppassword=").append(emppassword);
        sb.append(", empsalery=").append(empsalery);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}