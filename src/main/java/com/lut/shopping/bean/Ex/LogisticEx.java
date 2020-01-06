package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.Commodity;
import com.lut.shopping.bean.Order;

import java.io.Serializable;
import java.util.Date;

public class LogisticEx implements Serializable {
    private String cname;
    private int oid;
    private String daddress;
    private String gaddress;
    private Date gdate;
    private String company;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getDaddress() {
        return daddress;
    }

    public void setDaddress(String daddress) {
        this.daddress = daddress;
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setGaddress(String gaddress) {
        this.gaddress = gaddress;
    }

    public Date getGdate() {
        return gdate;
    }

    public void setGdate(Date gdate) {
        this.gdate = gdate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
