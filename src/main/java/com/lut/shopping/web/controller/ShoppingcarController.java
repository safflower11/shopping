package com.lut.shopping.web.controller;

import com.lut.shopping.bean.*;
import com.lut.shopping.bean.Ex.CommodityshowEx;
import com.lut.shopping.bean.Ex.ShoppingcarEx;
import com.lut.shopping.service.ICommodityService;
import com.lut.shopping.service.IShoppingcarService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;
import java.util.List;

@RestController
@RequestMapping("/shoppingcar")
@Api(description = "购物车管理")
public class ShoppingcarController {
    @Autowired
    private IShoppingcarService iShoppingcarService;
    @Autowired
    private ICommodityService iCommodityService;

    @GetMapping("/show")
    @ApiOperation(value = "根据用户ID查询相应用户的购物车信息")
    public Message show(int user_id){
        List<ShoppingcarEx> shoppingcarExes=iShoppingcarService.showshopcar(user_id);
        return MessageUtil.success(shoppingcarExes);
    }
    @GetMapping("delete")
    @ApiOperation(value = "删除单个购物车信息")
    public Message delete(int id){
        iShoppingcarService.delete(id);
        return MessageUtil.success("删除成功");
    }

    @GetMapping("deleteall")
    @ApiOperation(value = "批量删除购物车信息")
    public Message deleteall(int [] ids){
        for (int id:ids){
        iShoppingcarService.delete(id);
        }
        return MessageUtil.success("删除成功");
    }

    @PostMapping("/addorder")
    @ApiOperation(value ="下单" )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user_id",value = "用户ID",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "name",value = "商品名称",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "num",value = "下单数量",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "getaddress",value = "收货地址",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "receivename",value = "收货人",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "receivephone",value = "联系方式",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "company",value = "物流公司",paramType = "query",dataType = "String")
    })
    public Message addorder(int user_id,String name,int num,String getaddress,String receivename,String receivephone,String company){
        List<ShoppingcarEx> shoppingcarExes=iShoppingcarService.showshopcar(user_id);
        for (ShoppingcarEx shoppingcarEx:shoppingcarExes) {
            List<CommodityshowEx> commodityExList = shoppingcarEx.getCommodityExList();
            for (CommodityshowEx commodityEx:commodityExList) {
                int commodity_id1 = commodityEx.getId();
                Commodity commodity = iCommodityService.selectname(name);
                int commodity_id = commodity.getId();
                if (commodity_id1 != commodity_id) {
                 throw new RuntimeException("购物车中没有该商品");
                }
                else {
                double dprice = commodity.getPrice();
                int number = commodity.getNumber();

                 if (num > number) {
                    throw new RuntimeException("商品数量剩余不足");
                 } else {
                    double totalprice = num * dprice;
                    Logistic logistic = iCommodityService.selectcompany(company);
                    int logistic_id = logistic.getId();
                    Address address = iCommodityService.selectaddid(getaddress, receivename, receivephone);
                     if (address == null) {
                        iCommodityService.insertaddresee(getaddress, receivename, receivephone);
                        Address address2 = iCommodityService.selectaddid(getaddress, receivename, receivephone);
                        int address_id = address2.getId();
                        iCommodityService.addorder(user_id, num, totalprice, address_id, logistic_id);
                        Order order = iCommodityService.selectmax();
                        int order_id = order.getId();
                        iCommodityService.addco(commodity_id, order_id);
                        } else {
                        int address_id = address.getId();
                        iCommodityService.addorder(user_id, num, totalprice, address_id, logistic_id);
                        Order order = iCommodityService.selectmax();
                        int order_id = order.getId();
                        iCommodityService.addco(commodity_id, order_id);
                      }
                }
            }
        }
        }

        return MessageUtil.success("下单成功");
    }

}
