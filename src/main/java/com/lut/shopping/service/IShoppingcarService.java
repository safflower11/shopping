package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.CommodityshowEx;
import com.lut.shopping.bean.Ex.ShoppingcarEx;
import com.lut.shopping.bean.Shoppingcar;

import java.util.List;

public interface IShoppingcarService {
    List<ShoppingcarEx> showshopcar(int user_id) throws RuntimeException;
    void delete(int id) throws RuntimeException;

}
