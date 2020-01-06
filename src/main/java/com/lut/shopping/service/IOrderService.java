package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.bean.Ex.OrderEx;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IOrderService {
    List<CoEx> findAll() throws RuntimeException;
    void deleteById(int id) throws RuntimeException;
    List<OrderEx> findById(int id) throws RuntimeException;
    void receiveById(int id) throws RuntimeException;
}
