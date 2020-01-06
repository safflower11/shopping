package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Ex.LogisticEx;

import java.util.List;

public interface LogisticExMapper {
    List<LogisticEx> selectByWord(String word);
    LogisticEx findById(int id);
    List<LogisticEx> findAll();

}
