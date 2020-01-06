package com.lut.shopping.bean.Ex;

import com.lut.shopping.bean.Shop;

import java.io.Serializable;

public class QuestionEX implements Serializable {
    private Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
