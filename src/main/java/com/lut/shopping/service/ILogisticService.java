package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.LogisticEx;

import java.util.List;

public interface ILogisticService {
    List<LogisticEx> selectAll() throws RuntimeException;
}
