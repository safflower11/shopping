package com.lut.shopping.bean.Ex;

<<<<<<< HEAD
import java.io.Serializable;

public class LogisticEx implements Serializable {
=======
import java.util.Date;

public class LogisticEx {
    private int id;
    private String company;
    private String code;
    private String status;
    private Date getdate;
    private Date deliverdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getGetdate() {
        return getdate;
    }

    public void setGetdate(Date getdate) {
        this.getdate = getdate;
    }

    public Date getDeliverdate() {
        return deliverdate;
    }
>>>>>>> 5e35812cc6238a5b0ae90e8f42a05299f0ed49cb

    public void setDeliverdate(Date deliverdate) {
        this.deliverdate = deliverdate;
    }
}
