package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Ex.CommodityEx;
import com.lut.shopping.bean.Shoppingcar;


import java.util.List;

public interface CommodityExMapper {
    List<CommodityEx> selectshow();
    void insertshopcar(Shoppingcar shoppingcar);
}
