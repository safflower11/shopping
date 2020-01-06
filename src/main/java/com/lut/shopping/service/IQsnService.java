package com.lut.shopping.service;

import com.lut.shopping.bean.Appraise;
import com.lut.shopping.bean.Ex.SEX;

import java.util.List;

public interface IQsnService {
    List<SEX> selectscore(int id) throws RuntimeException;
    //用户评分
    void score(Appraise appraise) throws RuntimeException;

    List<Appraise> findAll(int id) throws RuntimeException;
}
