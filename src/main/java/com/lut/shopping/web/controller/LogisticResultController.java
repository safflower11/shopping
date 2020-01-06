package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Ex.LogisticResultEx;
import com.lut.shopping.service.ILogisticResultService;
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
@RequestMapping("/select")
@Api(description="物流管理/物流进度")
public class LogisticResultController {
    @Autowired
    private ILogisticResultService iLogisticResultService;
    @GetMapping("/select")
    @ApiOperation(value = "关键字搜索")
    public Message selectBy(String word){
        List<LogisticResultEx> logisticResultExList =iLogisticResultService.findBy(word);
        return MessageUtil.success(logisticResultExList);
    }
    @GetMapping("/selectById")
    @ApiOperation(value = "根据id查询")
    public Message findById(int id){
        LogisticResultEx logisticResultExList = iLogisticResultService.findById(id);
        return MessageUtil.success(logisticResultExList);
    }
    @GetMapping("/selectAll")
    @ApiOperation(value = "查询所有")
    public Message findALl(){
        List<LogisticResultEx> logisticResultExList = iLogisticResultService.findAll();
        return MessageUtil.success(logisticResultExList);
    }
}
