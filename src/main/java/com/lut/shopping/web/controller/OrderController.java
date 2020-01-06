package com.lut.shopping.web.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.lut.shopping.bean.Commodity;
import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.bean.Ex.OrderEXx;
import com.lut.shopping.bean.Ex.OrderEx;
import com.lut.shopping.bean.Order;
import com.lut.shopping.config.AlipayConfig;
import com.lut.shopping.service.IOrderService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@RestController
@Api(description = "订单管理")
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    private IOrderService iOderService;

    @GetMapping("/showbuyer")
    @ApiOperation(value = "预览")
    public Message showById(int id){
        List<OrderEx> list=iOderService.findById(id);
        return MessageUtil.success(list);

    }
    @GetMapping("/findall")
    @ApiOperation(value="买家查询订单信息")
    public Message findall(){
        List<CoEx> list=iOderService.findAll();
        System.out.println(list);
        return MessageUtil.success(list);
    }

    @GetMapping("/deleteById")
    @ApiOperation(value="根据id删除订单信息")
    public Message deleteById(int id){
        iOderService.deleteById(id);
        return MessageUtil.success();
    }

    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")
    public Message deleteBatch(int[] ids){
        for (int id:ids){
            iOderService.deleteById(id);
            System.out.println(id);
        }
        return MessageUtil.success();
    }

    @PostMapping("/receiveById")
    @ApiOperation(value = "确认收货")
    public Message recieveById(int id) {
        iOderService.receiveById(id);
        return MessageUtil.success();
    }
    @GetMapping("/selectall")
    @ApiOperation(value="卖家查询订单信息")
    public Message selectall(){
        List<OrderEXx> list=iOderService.selectAll();
        System.out.println(list);
        return MessageUtil.success(list);
    }
    @GetMapping("/showseller")
    @ApiOperation(value = "预览并编辑")
    public Message show(int id){
        List<OrderEXx> list=iOderService.selectById(id);
        return MessageUtil.success(list);

    }
    @GetMapping("/receive")
    @ApiOperation(value = "确认收货")
    public Message deliverById(int id){
        iOderService.deliverById(id);
        return MessageUtil.success();
    }
    @GetMapping("/pay")
    @ApiOperation(value = "确认支付")
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ddd");
        try {
            AlipayClient alipayClient =
                    AlipayConfig.getAlipayClient();
            //设置请求参数
            AlipayTradePagePayRequest alipayRequest =
                    new AlipayTradePagePayRequest();

            AlipayTradePayModel model =
                    new AlipayTradePayModel();

            // 设定订单号 必须要写,且订单号不能重复，目前已经只是做测试，已经写死
            model.setOutTradeNo(System.currentTimeMillis() + "");

            // 设置订单金额
            model.setTotalAmount("100.00");
            // 订单名字
            model.setSubject("书籍订单");
            // 订单描述
            model.setBody(System.currentTimeMillis()+"");

            // 产品码
            model.setProductCode("FAST_INSTANT_TRADE_PAY");

            // 设置参数
            alipayRequest.setBizModel(model);

            // 设置回调地址
            alipayRequest.setReturnUrl(AlipayConfig.return_url);

            String result = alipayClient.pageExecute(alipayRequest).getBody();

            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
