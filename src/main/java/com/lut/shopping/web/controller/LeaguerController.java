package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Commodity;
import com.lut.shopping.bean.Ex.CommodityAll;
import com.lut.shopping.bean.Ex.CommodityEx;
import com.lut.shopping.bean.Ex.CommodityshowEx;
import com.lut.shopping.bean.Ex.LeaguerEx;
import com.lut.shopping.bean.User;
import com.lut.shopping.service.ICommodityService;
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
@RequestMapping("/leaguer")
@Api(description = "会员管理")
public class LeaguerController {
    @Autowired
    private ICommodityService iCommodityService;

    @GetMapping("/show")
    @ApiOperation(value = "会员商品展示")
    public Message show(int user_id){
        User user=iCommodityService.selectById(user_id);
        if(user.getCode()==4){
            List<LeaguerEx> leaguerExes=iCommodityService.showleaguer();
            return MessageUtil.success(leaguerExes);
        }else if(user.getCode()==3){
            List<CommodityshowEx> commodityshowExes=iCommodityService.commodityshow();
            return MessageUtil.success(commodityshowExes);
        }else if(user.getCode()==1||user.getCode()==2){
            List<CommodityAll> commodityAlls=iCommodityService.selectallcom();
            return MessageUtil.success(commodityAlls);
        }else {
            throw new RuntimeException("不存在该用户");
        }
    }
}
