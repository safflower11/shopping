package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Ex.ShopEx;
import com.lut.shopping.bean.Ex.ShopResult;
import com.lut.shopping.service.IShopService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
@Api(description = "店铺管理")
public class ShopController {
    @Autowired
    private IShopService shopService;
    @GetMapping("/findAll")
    public Message findAll(){
        List<ShopResult> all = shopService.findAll();
        return MessageUtil.success(all);
    }


}
