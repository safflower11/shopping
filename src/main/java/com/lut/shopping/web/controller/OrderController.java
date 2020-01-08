package com.lut.shopping.web.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.google.zxing.Result;
import com.lut.shopping.bean.Address;
import com.lut.shopping.bean.Commodity;
import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.bean.Ex.OrderEXx;
import com.lut.shopping.bean.Ex.OrderEx;
import com.lut.shopping.bean.Order;
import com.lut.shopping.config.AlipayConfig;
import com.lut.shopping.service.IOrderService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import com.lut.shopping.util.QRCodeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
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
        List<OrderEx> list= (List<OrderEx>) iOderService.findById(id);
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
        return MessageUtil.success(list);
    }
    @GetMapping("/showseller")
    @ApiOperation(value = "预览并编辑")
    public Message show(int id){
        List<OrderEXx> list=iOderService.selectById(id);
        return MessageUtil.success(list);

    }
    @GetMapping("/deliverById")
    @ApiOperation(value = "确认发货")
    public Message deliverById(int id){
        iOderService.deliverById(id);
        return MessageUtil.success();
    }
    @GetMapping("/pay")
    @ApiOperation(value = "确认支付")
    protected void doGet(int orderEx_id,int order_id,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            AlipayClient alipayClient =
                    AlipayConfig.getAlipayClient();
            //设置请求参数
            AlipayTradePagePayRequest alipayRequest =
                    new AlipayTradePagePayRequest();

            AlipayTradePayModel model =
                    new AlipayTradePayModel();
            OrderEx orderEx=iOderService.findById(orderEx_id);
            // 设定订单号 必须要写,且订单号不能重复，目前已经只是做测试，已经写死
            model.setOutTradeNo(System.currentTimeMillis() + "");

            String price=String.valueOf(orderEx.getTotalprice());
            // 设置订单金额
            model.setTotalAmount(price);

            // 订单名字
            model.setSubject(orderEx.getCname());
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
            Order order=iOderService.findorderId(order_id);
            if ("待付款".equals(order.getStatus())) {
            order.setStatus("待发货");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @GetMapping("/download")
    @ApiOperation(value = "下载")
    public void download(int id,HttpServletResponse response) throws Exception{
        OrderEx orderEx = iOderService.findById(id);
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellType(CellType.STRING);
        cell.setCellValue("订单详细信息");
        //2
        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("商品名称");
        row2.createCell(1).setCellValue(orderEx.getCname());
        //3
        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("商品数量");
        row3.createCell(1).setCellValue(orderEx.getNumber());
        //4
        XSSFRow row4 = sheet.createRow(3);
        row4.createCell(0).setCellValue("总钱数");
        row4.createCell(1).setCellValue(orderEx.getTotalprice());
        //5
        XSSFRow row5 = sheet.createRow(4);
        row5.createCell(0).setCellValue("收货地址");
        row5.createCell(1).setCellValue(orderEx.getAgetaddress());
        //6
        XSSFRow row6 = sheet.createRow(5);
        row6.createCell(0).setCellValue("收货人");
        row6.createCell(1).setCellValue(orderEx.getUname());
        //7
        XSSFRow row7 = sheet.createRow(6);
        row7.createCell(0).setCellValue("联系电话");
        row7.createCell(1).setCellValue(orderEx.getAreceivephone());
        //8
        XSSFRow row8 = sheet.createRow(7);
        row8.createCell(0).setCellValue("物流公司");
        row8.createCell(1).setCellValue(orderEx.getLcompany());

        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode("订单详细信息"+".xlsx", "utf-8"));
        workbook.write(response.getOutputStream());
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改")
    public void update(int order_id,String adeliveraddress, String adelivername, String adiliverphone){
        Order order=iOderService.findorderId(order_id);
        int address_id=order.getAddressId();
        Address address=iOderService.findadress(address_id);
        iOderService.update(adeliveraddress,adelivername,adiliverphone);


    }

    @GetMapping("/select")
    @ApiOperation(value="卖家根据status或者code查询订单信息")
    public Message search(String key,String word){
        List<OrderEXx> lists=iOderService.search(key,word);
        return MessageUtil.success(lists);

    }



    /**
     * 生成二维码
     */
    @GetMapping("/QRCode")
    public void productcode() {
        QRCodeUtil.zxingCodeCreate("http://127.0.0.1:9999/swagger-ui.html", "D:/lzlg/picture/2018/",500,"D:/lzlg/picture/2018/5.jpg");
    }

    /**
     * 解析二维码
     */
    @GetMapping("/test")
    public void analysiscode() {
        Result result = QRCodeUtil.zxingCodeAnalyze("D:/lzlg/picture/2018/759.jpg");
        System.err.println("二维码解析内容："+result.toString());
    }
}
