package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Ex.OrderEXx;
import com.lut.shopping.bean.Ex.OrderEx;

import java.util.List;

public interface OrderExMapper {
    List<OrderEx> findById(int id);
    List<OrderEXx> selectById(int id);
    List<OrderEXx> selectAll();
}
