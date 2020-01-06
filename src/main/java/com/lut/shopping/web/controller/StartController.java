package com.lut.shopping.web.controller;

import com.lut.shopping.service.IOrderService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "确认收货")
@RequestMapping("/Start")
public class StartController {

    @Autowired
    private IOrderService iOrderService;
    @PostMapping("/receiveById")
    public Message recieveById(int id) {
        iOrderService.receiveById(id);
        return MessageUtil.success();
    }
}
