package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Co;
import com.lut.shopping.bean.Commodity;
import com.lut.shopping.bean.Ex.OrderEXx;

import java.util.List;

public interface OrderEXxMapper {
    List<OrderEXx> selectAll();
    List<OrderEXx> selectById(int id);
    Co selectcommodity(int order_id);
    Commodity selectid(int id);
}
