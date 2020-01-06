package com.lut.shopping.mapper.ex;

import com.lut.shopping.bean.Ex.ShopEx;
import com.lut.shopping.bean.Ex.ShopResult;
import com.lut.shopping.bean.Shop;

import java.util.List;

public interface ShopEXMapper {
    List<ShopResult> findAll();

    void updateById(Shop shop);
}
