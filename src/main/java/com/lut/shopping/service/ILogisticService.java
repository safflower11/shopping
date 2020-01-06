package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.LogisticEx;

import java.util.List;

public interface ILogisticService {
    List<LogisticEx> findAll() throws RuntimeException;
    List<LogisticEx> findBy(String word) throws RuntimeException;
    LogisticEx findById(int id) throws RuntimeException;

}
