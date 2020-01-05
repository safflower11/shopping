package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.LoEx;

import java.util.List;

public interface ILogisticService {
    List<LoEx> selectAll() throws RuntimeException;
}
