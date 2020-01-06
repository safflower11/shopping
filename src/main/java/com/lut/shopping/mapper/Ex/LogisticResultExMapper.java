package com.lut.shopping.mapper.Ex;


import com.lut.shopping.bean.Ex.LogisticResultEx;
import com.lut.shopping.bean.Logistic;

import java.util.Date;
import java.util.List;

public interface LogisticResultExMapper {
    List<LogisticResultEx> selectByWord(String word);
    LogisticResultEx findById(int id);
    List<LogisticResultEx> findAll();
    void deleteById(int id);
    void insert(Logistic logistic);
}
