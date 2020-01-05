package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Ex.LoEx;

import java.util.List;

public interface LoExMapper {
    List<LoEx> selectAll();
    List<LoEx> search();
}
