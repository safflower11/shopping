package com.lut.shopping.web.controller;

import com.lut.shopping.bean.*;
import com.lut.shopping.bean.Ex.CommodityEx;
import com.lut.shopping.bean.Ex.CommodityshowEx;
import com.lut.shopping.bean.Ex.Comone;
import com.lut.shopping.service.ICommodityService;
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

import java.util.List;

@RestController
@RequestMapping("/Commodity")
@Api(description = "商品管理")
public class CommodityController {
    @Autowired
    private ICommodityService iCommodityService;
    @GetMapping("/show")
    @ApiOperation(value ="商品信息展示" )
    public Message show(){
        List<CommodityEx> commodityExes=iCommodityService.show();
        return MessageUtil.success(commodityExes);
    }
    @PostMapping("/add")
    @ApiOperation(value ="加入购物车" )
    public Message add(Shoppingcar shoppingcar){
        iCommodityService.insert(shoppingcar);
        return MessageUtil.success(shoppingcar);
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
        Commodity commodity=iCommodityService.selectname(name);
        int commodity_id=commodity.getId();
        double dprice=commodity.getPrice();
        int number=commodity.getNumber();
        System.out.println(number);
        if(num>number){
           throw new RuntimeException("商品数量剩余不足");
        }else{
        double totalprice=num*dprice;
        Logistic logistic=iCommodityService.selectcompany(company);
        int logistic_id=logistic.getId();
        System.out.println(logistic_id);
        Address address=iCommodityService.selectaddid(getaddress,receivename,receivephone);
        if(address==null){
            iCommodityService.insertaddresee(getaddress,receivename,receivephone);
            Address address2=iCommodityService.selectaddid(getaddress,receivename,receivephone);
            int address_id=address2.getId();
            iCommodityService.addorder(user_id,num,totalprice,address_id,logistic_id);
            Order order= iCommodityService.selectmax();
            int order_id=order.getId();
            iCommodityService.addco(commodity_id,order_id);
        }else {
            int address_id=address.getId();
            iCommodityService.addorder(user_id,num,totalprice,address_id,logistic_id);
            Order order= iCommodityService.selectmax();
            int order_id=order.getId();
            iCommodityService.addco(commodity_id,order_id);
        }}
        return MessageUtil.success("下单成功");
    }

    @GetMapping("/commodityshow")
    @ApiOperation(value ="商品上新下架信息展示" )
    public Message commodityshow(){
        List<CommodityshowEx> commodityshowExes=iCommodityService.commodityshow();
        return MessageUtil.success(commodityshowExes);
    }

    @PostMapping("/upnew")
    @ApiOperation(value ="商品上新" )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "商品名称",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "shopname",value = "店铺名称",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "upnum",value = "上新数量",paramType = "query",dataType = "int")
    })
    public Message upnew(String name,String shopname,int upnum){
        Shop shop=iCommodityService.selectshop(shopname);
        Repertory repertory=iCommodityService.selere(name);
        if(shop==null){
            throw new RuntimeException("不存在该店铺,请重新输入");
        }else {
            int shop_id=shop.getId();
            if (repertory==null){
                throw new RuntimeException("仓库中不存在该商品");
            }else {
                Commodity commodity = iCommodityService.selectname(name);
                if (commodity == null) {
                    int number = 0;
                    double price = repertory.getPrice()*1.25;
                    iCommodityService.insertco(name, number, price);
                    Commodity commodity1=iCommodityService.selectname(name);
                    int commodity_id1 = commodity1.getId();
                    System.out.println(commodity_id1);
                    int rnum = repertory.getNumber();
                    if (upnum > rnum) {
                        throw new RuntimeException("库存不足，不能上新");
                    } else {
                        int beforenum = commodity1.getNumber();
                        int afternum = beforenum + upnum;
                        int afterrnum=rnum-upnum;
                        System.out.println(afterrnum);
                        Cs cs = iCommodityService.selectcs(shop_id, commodity_id1);
                        if (cs == null) {
                            iCommodityService.insertcs(shop_id, commodity_id1);
                            iCommodityService.updateco(afternum);
                            iCommodityService.updatere(afterrnum);
                        } else {
                            iCommodityService.updateco(afternum);
                            iCommodityService.updatere(afterrnum);
                        }
                    }
                } else {
                    int commodity_id = commodity.getId();
                    int rnum = repertory.getNumber();
                    if (upnum > rnum) {
                        throw new RuntimeException("库存不足，不能上新");
                    } else {
                        int beforenum = commodity.getNumber();
                        int afternum = beforenum + upnum;
                        int afterrnum=rnum-upnum;
                        System.out.println(afterrnum);
                        Cs cs = iCommodityService.selectcs(shop_id, commodity_id);
                        if (cs == null) {
                            iCommodityService.insertcs(shop_id, commodity_id);
                            iCommodityService.updateco(afternum);
                            iCommodityService.updatere(afterrnum);
                        } else {
                            iCommodityService.updateco(afternum);
                            iCommodityService.updatere(afterrnum);
                        }
                    }
                }
            }
        }
        double payprice=repertory.getPrice()*upnum;
        return MessageUtil.success(payprice);
    }

    @PostMapping("/pay")
    public Message pay(){
        return MessageUtil.success();
    }

    @GetMapping("/under")
    @ApiOperation(value ="商品下架" )
    public Message under(int id){
        iCommodityService.under(id);
        return  MessageUtil.success("下架成功");
    }

    @GetMapping("/showone")
    @ApiOperation(value ="查询某一店铺的上架商品" )
    @ApiImplicitParam(name = "name",value = "店铺名称",paramType = "query",dataType = "String")
    public Message showone(String name){
       List<Comone> comones=iCommodityService.showone(name);
       return MessageUtil.success(comones);

    }
}
