package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Appraise;
import com.lut.shopping.bean.Ex.QuestionEX;
import com.lut.shopping.bean.Ex.SEX;
import com.lut.shopping.bean.Shop;

import java.util.List;

public interface QsnEXMapper {
    List<SEX> selectscore(int id);

    List<Appraise> findAll(int id);

    QuestionEX findBy(int id);

    Shop findByShopid(int id);
}
