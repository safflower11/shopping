package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Ex.LoEx;
import com.lut.shopping.bean.Ex.LogisticEx;
import com.lut.shopping.service.ILogisticService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/logistic")
@Api(description = "物流管理")
public class LogisticController {

    @Autowired
    private ILogisticService iLogisticService;
    @GetMapping("/search")
    @ApiOperation(value = "搜索")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "key1",value = "商品名称",paramType = "query",dataType = "String"),
                    @ApiImplicitParam(name = "key2",value = "订单编号",paramType = "query",dataType = "String"),
                    @ApiImplicitParam(name = "key3",value = "寄件地址",paramType = "query",dataType = "String"),
                    @ApiImplicitParam(name = "key4",value = "收件地址",paramType = "query",dataType = "String"),
                    @ApiImplicitParam(name = "key5",value = "下单时间",paramType = "query",dataType = "Date"),
                    @ApiImplicitParam(name = "key6",value = "快递单号",paramType = "query",dataType = "Date"),
                    @ApiImplicitParam(name = "key7",value = "是否到货",paramType = "query",dataType = "String"),
                    @ApiImplicitParam(name = "word",value = "关键字",paramType = "query",dataType = "String")

            }
    )
    public Message selectAll(){
        List<LoEx> loExes =iLogisticService.selectAll();
        return MessageUtil.success(loExes);
    }



}
