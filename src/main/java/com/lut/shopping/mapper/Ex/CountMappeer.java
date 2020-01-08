package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Ex.Count;
import com.lut.shopping.bean.Ex.Price;

import java.util.List;

public interface CountMappeer {
    List<Count> countByOrderId(int id,int year,int month);

    Price findPrice(int id,int year,int month);

    Price findDiscount(int id,int year,int month);

}
