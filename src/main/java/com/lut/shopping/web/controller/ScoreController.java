package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Appraise;
import com.lut.shopping.service.IQsnService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    private IQsnService qsnService;
    @PostMapping("insert")
    public Message insert(Appraise appraise){
        qsnService.score(appraise);
        return MessageUtil.success();
    }

}
