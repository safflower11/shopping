package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Ex.CommodityEx;
import com.lut.shopping.bean.Order;
import com.lut.shopping.bean.Shoppingcar;
import com.lut.shopping.service.ICommodityService;
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
@RequestMapping("/Commodity")
@Api(description = "商品管理")
public class CommodityController {
    @Autowired
    private ICommodityService iCommodityService;
    @GetMapping("/show")
    @ApiOperation(value ="商品信息展示" )
    public Message show(){
        List<CommodityEx> commodityExes=iCommodityService.show();
        return MessageUtil.success(commodityExes);
    }
    @PostMapping("/add")
    @ApiOperation(value ="加入购物车" )
    public Message add(Shoppingcar shoppingcar){
        iCommodityService.insert(shoppingcar);
        return MessageUtil.success(shoppingcar);
    }

    @PostMapping("/addorder")
    public Message addorder(String name,int num,double price,String getaddress,String getname,String phone,String company){
        Order order=new Order();
        iCommodityService.addorder(order);

        return MessageUtil.success();

    }
}
