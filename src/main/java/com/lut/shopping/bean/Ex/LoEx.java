package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.Commodity;
import com.lut.shopping.bean.Order;

import java.io.Serializable;
import java.util.List;

public class LoEx implements Serializable {
    private List<LogisticEx> logisticExes;
    private List<Order> orders;
    private List<Commodity> commodities;

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
