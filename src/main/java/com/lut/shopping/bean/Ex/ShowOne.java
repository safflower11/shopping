package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.Commodity;

import java.io.Serializable;
import java.util.List;

public class ShowOne implements Serializable {
    private List<Commodity> commodityList;
    public List<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<Commodity> commodityList) {
        this.commodityList = commodityList;
    }
}
