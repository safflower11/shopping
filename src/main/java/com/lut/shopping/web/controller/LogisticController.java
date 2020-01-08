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
@Api(description = "物流管理/历史取件信息")
public class LogisticController {

    @Autowired
    private ILogisticService iLogisticService;
    @GetMapping("/select")
    @ApiOperation(value = "关键字搜索")
    public Message selectBy(String word){
        List<LogisticEx> logisticResultExList =iLogisticService.findBy(word);
        return MessageUtil.success(logisticResultExList);
    }
    @GetMapping("/selectById")
    @ApiOperation(value = "根据id查询")
    public Message findById(int id){
        LogisticEx logisticExList = iLogisticService.findById(id);
        return MessageUtil.success(logisticExList);
    }
    @GetMapping("/selectAll")
    @ApiOperation(value = "查询所有")
    public Message findAll(){
        List<LogisticEx> logisticResultExList = iLogisticService.findAll();
        return MessageUtil.success(logisticResultExList);
    }



}
