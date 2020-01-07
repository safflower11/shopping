package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Appraise;
import com.lut.shopping.bean.Ex.Count;
import com.lut.shopping.bean.Ex.Price;
import com.lut.shopping.service.ICountService;
import com.lut.shopping.service.IQsnService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/score")
@Api(description = "评分及统计")
public class ScoreController {
    @Autowired
    private IQsnService qsnService;
    @Autowired
    private ICountService countService;
    @PostMapping("insert")
    public Message insert(Appraise appraise){
        qsnService.score(appraise);
        return MessageUtil.success();
    }

    @GetMapping("/count")
    public Message count(){
        List<Count> counts = countService.countByOrderId();
        return MessageUtil.success(counts);
    }

    @GetMapping("/countPrice")
    public Message countPrice(int id,int year,int month){
        Price price = countService.findPrice(id,year,month);
        return MessageUtil.success(price);
    }


}
