package com.oracle.pojo;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private Integer customerid;

    private Integer companyid;

    private String customername;

    private String customerphone;

    private String customersex;

    private String customertype;

    private Date customerbirthday;

    private Date customercreatetime;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone == null ? null : customerphone.trim();
    }

    public String getCustomersex() {
        return customersex;
    }

    public void setCustomersex(String customersex) {
        this.customersex = customersex == null ? null : customersex.trim();
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype == null ? null : customertype.trim();
    }

    public Date getCustomerbirthday() {
        return customerbirthday;
    }

    public void setCustomerbirthday(Date customerbirthday) {
        this.customerbirthday = customerbirthday;
    }

    public Date getCustomercreatetime() {
        return customercreatetime;
    }

    public void setCustomercreatetime(Date customercreatetime) {
        this.customercreatetime = customercreatetime;
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
        Customer other = (Customer) that;
        return (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getCustomername() == null ? other.getCustomername() == null : this.getCustomername().equals(other.getCustomername()))
            && (this.getCustomerphone() == null ? other.getCustomerphone() == null : this.getCustomerphone().equals(other.getCustomerphone()))
            && (this.getCustomersex() == null ? other.getCustomersex() == null : this.getCustomersex().equals(other.getCustomersex()))
            && (this.getCustomertype() == null ? other.getCustomertype() == null : this.getCustomertype().equals(other.getCustomertype()))
            && (this.getCustomerbirthday() == null ? other.getCustomerbirthday() == null : this.getCustomerbirthday().equals(other.getCustomerbirthday()))
            && (this.getCustomercreatetime() == null ? other.getCustomercreatetime() == null : this.getCustomercreatetime().equals(other.getCustomercreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getCustomername() == null) ? 0 : getCustomername().hashCode());
        result = prime * result + ((getCustomerphone() == null) ? 0 : getCustomerphone().hashCode());
        result = prime * result + ((getCustomersex() == null) ? 0 : getCustomersex().hashCode());
        result = prime * result + ((getCustomertype() == null) ? 0 : getCustomertype().hashCode());
        result = prime * result + ((getCustomerbirthday() == null) ? 0 : getCustomerbirthday().hashCode());
        result = prime * result + ((getCustomercreatetime() == null) ? 0 : getCustomercreatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerid=").append(customerid);
        sb.append(", companyid=").append(companyid);
        sb.append(", customername=").append(customername);
        sb.append(", customerphone=").append(customerphone);
        sb.append(", customersex=").append(customersex);
        sb.append(", customertype=").append(customertype);
        sb.append(", customerbirthday=").append(customerbirthday);
        sb.append(", customercreatetime=").append(customercreatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}