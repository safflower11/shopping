package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Ex.OrderEXx;

import java.util.List;

public interface OrderEXxMapper {
    List<OrderEXx> selectAll();
    List<OrderEXx> selectById(int id);
}
