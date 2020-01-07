package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Ex.LogisticResultEx;
import com.lut.shopping.bean.Logistic;
import com.lut.shopping.service.ILogisticResultService;
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

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Logistic")
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
    @GetMapping("/insert")
    @ApiOperation(value = "添加")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "company",value = "物流公司",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "code",value = "物流编号",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "status",value = "物流状态",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "getdate",value = "收货时间",paramType = "query",dataType = "Date"),
            @ApiImplicitParam(name = "deliverdate",value = "发货时间",paramType = "query",dataType = "Date"),
    })
    public Message insert(String company, String code, String status, Date getdate, Date deliverdate){
        Logistic logistic = iLogisticResultService.insert(company,code,status,getdate,deliverdate);
        return MessageUtil.success("添加成功");
    }
    @GetMapping("/deleteById")
    @ApiOperation(value="根据id删除订单信息")
    public Message deleteById(int id){
        iLogisticResultService.deleteById(id);
        return MessageUtil.success("删除成功");
    }
    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")
    public Message deleteBatch(int[] ids){
        for (int id:ids){
            iLogisticResultService.deleteById(id);
            System.out.println(id);
        }
        return MessageUtil.success("删除成功");
    }

}
