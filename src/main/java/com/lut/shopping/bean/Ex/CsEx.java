package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.Shop;

import java.io.Serializable;
import java.util.List;

public class CsEx implements Serializable {
    private int id;
    private List<CommodityEx> commodityExList;
    private List<Shop> shops;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CommodityEx> getCommodityExList() {
        return commodityExList;
    }

    public void setCommodityExList(List<CommodityEx> commodityExList) {
        this.commodityExList = commodityExList;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }
}
