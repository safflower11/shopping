package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.ShopEx;
import com.lut.shopping.bean.Ex.ShopResult;


import java.util.List;

public interface IShopService {
    List<ShopResult> findAll() throws RuntimeException;

}
