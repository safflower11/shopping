package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.Order;

import java.io.Serializable;
import java.util.List;

public class CoEx implements Serializable {
    private Integer id;
    private List<CommodityEx> commodityExes;
    private List<OrderEx> orders;

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
