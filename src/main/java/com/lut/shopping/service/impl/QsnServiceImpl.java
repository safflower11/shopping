package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Appraise;
import com.lut.shopping.bean.Ex.QuestionEX;
import com.lut.shopping.bean.Ex.SEX;
import com.lut.shopping.bean.Shop;
import com.lut.shopping.mapper.AppraiseMapper;
import com.lut.shopping.mapper.ShopMapper;
import com.lut.shopping.mapper.Ex.QsnEXMapper;

import com.lut.shopping.mapper.Ex.QsnEXMapper;
import com.lut.shopping.mapper.Ex.ShopEXMapper;
import com.lut.shopping.service.IQsnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QsnServiceImpl implements IQsnService {
    @Autowired
    private QsnEXMapper qsnEXMapper;
    @Autowired
    private ShopEXMapper shopEXMapper;
    @Autowired
    private AppraiseMapper appraiseMapper;
    @Override
    public List<SEX> selectscore(int id) throws RuntimeException {
        return qsnEXMapper.selectscore(id);
    }

    @Override
    public void score(Appraise appraise) throws RuntimeException {

        if(appraise.getId()==null){
            appraiseMapper.insert(appraise);
        }

        List<Appraise> appraises=qsnEXMapper.findAll(appraise.getQuestionId());
        double score=0;
        for(Appraise appraise1:appraises){

            score=score+appraise1.getScore();
            System.out.println(score);
        }

        score=score/appraises.size();
        System.out.println(score);
        System.out.println(appraise.getQuestionId());
        QuestionEX question = qsnEXMapper.findBy(appraise.getQuestionId());

        System.out.println("question:"+question);
        Shop shop = qsnEXMapper.findByShopid(question.getShop().getId());
        shop.setScore(score);
        System.out.println("shop:"+shop);
        shopEXMapper.updateById(shop);
    }

    @Override
    public List<Appraise> findAll(int id) throws RuntimeException {
        return qsnEXMapper.findAll(id);
    }
}
