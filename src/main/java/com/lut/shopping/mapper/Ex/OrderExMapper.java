package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Ex.OrderEx;
import com.lut.shopping.bean.Order;

import java.util.List;

public interface OrderExMapper {
    OrderEx findById(int id);
    void update(Order order);

    List<OrderEx> findBy(int id);
}
