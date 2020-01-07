package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.Count;
import com.lut.shopping.bean.Ex.Price;

import java.util.List;

public interface ICountService {
    List<Count> countByOrderId() throws RuntimeException;

    Price findPrice(int id,int year,int month) throws RuntimeException;
}
