package com.lut.shopping.web.controller;

import com.google.zxing.Result;

import com.lut.shopping.util.QRCodeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 二维码调用前端控制器
 */
@RequestMapping("/Qrcode")
@RestController
public class QrcodeController {

    /**
     * 生成二维码
     */
    @GetMapping
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

