package com.lut.shopping.mapper.ex;

import com.lut.shopping.bean.Ex.ShopEx;
import com.lut.shopping.bean.Ex.ShopResult;

import java.util.List;

public interface ShopEXMapper {
    List<ShopResult> findAll();
}
