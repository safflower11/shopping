package com.lut.shopping.mapper.ex;

import com.lut.shopping.bean.Ex.Count;
import com.lut.shopping.bean.Ex.Price;

import java.util.List;

public interface CountMappeer {
    List<Count> countByOrderId();

    Price findPrice(int id,int year,int month);

    Price findDiscount(int id,int year,int month);

}
