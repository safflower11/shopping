package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Ex.ShopResult;
import com.lut.shopping.bean.Shop;

import java.util.List;

public interface ShopEXMapper {
    List<ShopResult> findAll();

    void updateById(Shop shop);
}
