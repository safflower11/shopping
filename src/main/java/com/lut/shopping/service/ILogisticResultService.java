package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.LogisticResultEx;

import java.util.List;

public interface ILogisticResultService {
    List<LogisticResultEx> findAll() throws RuntimeException;
    List<LogisticResultEx> findBy(String word) throws RuntimeException;
    LogisticResultEx findById(int id) throws RuntimeException;

}
