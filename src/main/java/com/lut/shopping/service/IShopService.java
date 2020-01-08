package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.ShopResult;
import com.lut.shopping.bean.Shop;


import java.util.List;

public interface IShopService {
    List<ShopResult> findAll() throws RuntimeException;
    void addOrUpdate(Shop shop) throws RuntimeException;
    void  delete(int id) throws RuntimeException;
    List<ShopResult> search(String key) throws RuntimeException;
    void delectBatch(int id)throws RuntimeException;
}
