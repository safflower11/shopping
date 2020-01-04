package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Ex.LogisticEx;
import com.lut.shopping.service.ILogisticService;
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
@RequestMapping("/logistic")
@Api(description = "物流管理")
public class LogisticController {

    @Autowired
    private ILogisticService iLogisticService;
    @GetMapping("/selectAll")
    @ApiOperation(value = "查询所有")
    public Message selectAll(){
        List<LogisticEx> logisticExes =iLogisticService.selectAll();
        return MessageUtil.success(logisticExes);
    }



}
