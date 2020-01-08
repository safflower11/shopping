package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Appraise;
import com.lut.shopping.bean.Ex.Count;
import com.lut.shopping.bean.Ex.Price;
import com.lut.shopping.bean.Ex.ShopResult;
import com.lut.shopping.bean.Shop;
import com.lut.shopping.service.ICountService;
import com.lut.shopping.service.IQsnService;
import com.lut.shopping.service.IShopService;
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
@Api(description = "店铺管理")
public class ShopController {
    @Autowired
    private IShopService shopService;

    @Autowired
    private IQsnService qsnService;
    @Autowired
    private ICountService countService;

    @GetMapping("/findAll")
    public Message findAll() {
        List<ShopResult> all = shopService.findAll();
        return MessageUtil.success(all);
    }

    @GetMapping("/delete")
    @ApiOperation(value = "根据id删除店铺")
    public void delete(int id) {
        shopService.delete(id);

    }
    @PostMapping("/add")
    @ApiOperation(value = "添加店铺")
    public Message add(Shop shop){
        shopService.addOrUpdate(shop);
        return MessageUtil.success();
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改店铺")
    public Message update(Shop shop){
        shopService.addOrUpdate(shop);
        return MessageUtil.success();
    }


    @GetMapping("/search")
    @ApiOperation(value ="搜索店铺" )
    public Message search(String key){
        List<ShopResult> list=shopService.search(key);
        return MessageUtil.success(list);
    }


    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")
    public Message deleteBatch(int[] ids ){
        for (int id : ids){
            shopService.delete(id);
        }
        return MessageUtil.success();
    }

    @PostMapping("insert")
    @ApiOperation(value = "用户对店铺评分")
    public Message insert(Appraise appraise){
        qsnService.score(appraise);
        return MessageUtil.success();
    }

    @GetMapping("/count")
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



