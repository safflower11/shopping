package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.bean.Ex.OrderEx;

import java.util.List;

public interface IOrderService {
    List<CoEx> findAll() throws RuntimeException;
    void deleteById(int id) throws RuntimeException;
    OrderEx findById(int id) throws RuntimeException;
}
