package com.lut.shopping.mapper.Ex;


import com.lut.shopping.bean.Ex.LogisticResultEx;

import java.util.List;

public interface LogisticResultExMapper {
    List<LogisticResultEx> selectByWord(String word);
    LogisticResultEx findById(int id);
    List<LogisticResultEx> findAll();

}
