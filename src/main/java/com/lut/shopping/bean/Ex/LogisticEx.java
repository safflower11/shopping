package com.lut.shopping.bean.Ex;

import java.io.Serializable;
import java.util.Date;

public class LogisticEx implements Serializable {

    private int id;
    private String company;
    private String code;
    private String status;
    private Date getdate;
    private Date deliverdate;
    private Integer orderId;
    private Integer commodityId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

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


    public void setDeliverdate(Date deliverdate) {
        this.deliverdate = deliverdate;
    }
}
