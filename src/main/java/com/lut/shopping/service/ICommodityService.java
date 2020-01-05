package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.CommodityEx;
import com.lut.shopping.bean.Order;
import com.lut.shopping.bean.Shoppingcar;

import java.util.List;

public interface ICommodityService {
    List<CommodityEx> show() throws RuntimeException;
    void insert(Shoppingcar shoppingcar) throws RuntimeException;
    void addorder(Order order) throws RuntimeException;
}
