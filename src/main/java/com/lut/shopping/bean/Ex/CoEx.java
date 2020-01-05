package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.Order;

import java.io.Serializable;
import java.util.List;

public class CoEx implements Serializable {
    private Integer id;
    private String cname;
    private String status;
    private List<CommodityEx> commodityExes;
    private List<OrderEx> orders;
    private Integer commodityId;
    private Integer orderId;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<CommodityEx> getCommodityExes() {
        return commodityExes;
    }

    public void setCommodityExes(List<CommodityEx> commodityExes) {
        this.commodityExes = commodityExes;
    }

    public List<OrderEx> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderEx> orders) {
        this.orders = orders;
    }
}
