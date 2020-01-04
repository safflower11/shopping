package com.lut.shopping.bean.Ex;

import java.io.Serializable;

public class RepertoryEx implements Serializable {
    private Integer id;
    private String commodityname;
    private Integer number;
    private Long price;
    private ShopEx shopEx;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public ShopEx getShopEx() {
        return shopEx;
    }

    public void setShopEx(ShopEx shopEx) {
        this.shopEx = shopEx;
    }
}
