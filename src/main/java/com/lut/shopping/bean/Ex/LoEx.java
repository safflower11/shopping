package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.Commodity;
import com.lut.shopping.bean.Order;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class LoEx implements Serializable {
    private int id;
    private String company;
    private String status;
    private Date getdate;
    private Date deliverdate;
    private List<LogisticEx> logisticExes;
    private List<Order> orders;
    private List<Commodity> commodities;
    private int orderid;
    private int commodityid;

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

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(int commodityid) {
        this.commodityid = commodityid;
    }

    public List<LogisticEx> getLogisticExes() {
        return logisticExes;
    }

    public void setLogisticExes(List<LogisticEx> logisticExes) {
        this.logisticExes = logisticExes;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
    }
}
