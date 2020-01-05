package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.bean.Ex.OrderEx;
import com.lut.shopping.service.IOrderService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Api(description = "订单管理")
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    private IOrderService iOderService;

    @GetMapping("/show")
    @ApiOperation(value = "预览")
    public Message showById(int id){
        OrderEx list=iOderService.findById(id);
        return MessageUtil.success(list);

    }

    @GetMapping("/findall")
    @ApiOperation(value="查询订单信息")
    public Message findall(){
        List<CoEx> list=iOderService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("/deleteById")
    @ApiOperation(value="根据id删除订单信息")
    public Message deleteById(int id){
        iOderService.deleteById(id);
        return MessageUtil.success();
    }

    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")
    public Message deleteBatch(int[] ids){
        for (int id:ids){
            iOderService.deleteById(id);
            System.out.println(id);
        }
        return MessageUtil.success();
    }

}
