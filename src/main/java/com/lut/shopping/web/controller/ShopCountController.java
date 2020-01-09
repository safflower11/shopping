package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Appraise;
import com.lut.shopping.bean.Ex.Count;
import com.lut.shopping.bean.Ex.Price;
import com.lut.shopping.bean.Ex.SEX;
import com.lut.shopping.service.ICountService;
import com.lut.shopping.service.IQsnService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
@Api(description = "店铺评分及统计")
public class ShopCountController {
    @Autowired
    private IQsnService qsnService;
    @Autowired
    private ICountService countService;

    @PostMapping("/qsnAppraise")
    @ApiOperation(value = "用户对店铺评分")
    public Message insert(Appraise appraise){
        qsnService.score(appraise);
        return MessageUtil.success();
    }

    @GetMapping("/qsn")
    @ApiOperation(value = "查看店铺评分")
    public Message get(int id){
        List<SEX> selectscore = qsnService.selectscore(id);
        return MessageUtil.success(selectscore);
    }

    @GetMapping("/countCommodity")
    @ApiOperation(value = "统计已完成订单的商品数量")
    public Message count(int id,int year,int month){
        List<Count> counts = countService.countByOrderId(id,year,month);
        return MessageUtil.success(counts);
    }

    @GetMapping("/countPrice")
    @ApiOperation(value = "统计店铺的利润")
    public Message countPrice(int id,int year,int month){
        Price price = countService.findPrice(id,year,month);
        return MessageUtil.success(price);
    }
}
