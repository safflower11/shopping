package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.User;

import java.io.Serializable;
import java.util.List;

public class ShoppingcarEx implements Serializable {

    private List<CommodityshowEx> commodityExList;

    public List<CommodityshowEx> getCommodityExList() {
        return commodityExList;
    }

    public void setCommodityExList(List<CommodityshowEx> commodityExList) {
        this.commodityExList = commodityExList;
    }
}
