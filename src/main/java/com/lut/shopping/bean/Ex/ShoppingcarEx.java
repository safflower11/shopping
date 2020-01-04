package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.User;

import java.io.Serializable;
import java.util.List;

public class ShoppingcarEx implements Serializable {
    private int id;
    private User user;
    private List<CommodityEx> commodityExList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<CommodityEx> getCommodityExList() {
        return commodityExList;
    }

    public void setCommodityExList(List<CommodityEx> commodityExList) {
        this.commodityExList = commodityExList;
    }
}
