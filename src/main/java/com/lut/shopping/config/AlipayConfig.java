package com.lut.shopping.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

public class AlipayConfig {
    /**
     * 服务网关   沙箱环境都是这个
     */
    public static String serverUrl = "https://openapi.alipaydev.com/gateway.do";

    /**
     * 应用id  后期可以替换成自己的id
     */
    public static String appId = "2016101900725508";

    /**
     *  用户私钥   后期替换成自己的私钥
     */
    public static String privateKey = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCC7fXpcuPqS1aA3noxMzh1g9A0h7eLnqh9v/Z6qOXJVH56pwOCh76omkjqfHJrC8x37WgSuNTiYUQVl/5kRag7VrweaHdk4jYXmKEK/YLi78BGPrAOC1SVrSnWa3+635SpEnkftW5wmBQnl8aQ4uPI8ecuH0HZ8eNir2sSeINuOHSZwcDchyup1MwpZFIFP1iWBTKZV9M4ydwgkrcopJMui16o4oAzOP16uSGG7uqjvltYwpK5TYHixUJ/fJGoRi3RxJhwUh6ejCDUVBGjaPRImsJ76sD6AdKgrnp5xj37AAyVf+NTt3hSDPKDbz04XkhtotF2brlNYnGULq6GEtXNAgMBAAECggEAOwJGn8VxJSp5PTGH/t6n5obW8qXsOlfydmJrExNGJTwYmOzm7xCBBHosvMoDw20Y5UAxdKarA7B0wAq107l1PfE0bbwFe4lcebwHcO2a7O7DSKV+MYY3xBG8VnAyrCWSWbUCtCDQOpzAEKweCTTJFsq3t5jM1A5pvhNzfWqlSaoxEuDbngifBqG1+HAhDe5jTnXid20gr8pt89B1+H+17sJtjYbN7qYV1JNa6YVasWbladiAIQNGXVDLo3FIjJzoqNdQ5hbkjlMBo0UCiAa83qsDOFfswM1isav7GyUix92pYoAPWRY4a/OVMGQw+vu8uIe7oHVi7rVNHqbls4Q3QQKBgQC4fZ3n2IZzkJwQ+KWFICQ6yb+Qk65rvjdOvfOurII0jExdHabUEoBiyt3OAwud58Bn1uTFh4WvxJWzYZgJdIN05pXPNzNj6QTKL8IJ/q81ybsOHXVemWUAcp3M9K7Q+M6qiKS8fSHQ4DY29uEurWkqmagLcwF3REKO8yfLVWtL3QKBgQC1racJiPQ4fZ1nKWCek9SrDjoY/h3AFU4cRwwwO4hRJMlqtfeqlv39JejeYWYycMPiHVrXidxZj+n9GaNJRXRyi0XcLudBG50O+x1LYpoZ+Siutwa9Q07Uhznz04bQ415usbETA+rQA4zK2vizwxr6GZb6rEmmbziNpgcVcDPKsQKBgBMUmtIxqKYnHJz8ulGsY1LZLsDLJUzrXVj9eEhmewjoQbWXrXtddn3BMXNvCTKJl3Kl3P845vCoyjrFKy4/KKFcf73wnZYFsYMfsVfLSV+sv3XUQiFIiBOlxwA9hh8CvI0SmMcNwgOSTMkee2eSc7/+KE0W1d3551BVgZYb/X7ZAoGATh825ZW7lpMFXTfgsS/WUhvTBa438sH2jZhLeG4RBvtvlPBcaEF3RCTKBt4RCP2Obau7xVUlqGmG72vX2AkCssKKrsyIamnKVofKqADlTOfkA4T2Y+oOersPQ3ag0TAECktkXk3f6cStBQm1ye7KqeLZFj+BiAzpX5eWEjTmQHECgYAdgbKtm98fF6mUEv5VYf0Nz3oqQJD8EKfohczqoSXnPvMLd1hj6KablQB2hI7Luf+UmE/5YWU/dOr8NtvhkYQU753UFEWF1vbJEBeNrF5o5FP6tBK8IfePm6cRHf766W/SNB8G2oVkRhDE+kMGPQoBxXM3mmtI8/OvdNsVMRTWGA==";
    /**
     *  发送数据的格式 目前只能为json
     */
    public static String format = "json";

    /**
     *  设置字符集编码 目前只能为utf-8
     */
    public static String charset = "utf-8";

    /**
     *  支付宝公钥 后期替换成自己的支付宝公钥
     */
    public static String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgu316XLj6ktWgN56MTM4dYPQNIe3i56ofb/2eqjlyVR+eqcDgoe+qJpI6nxyawvMd+1oErjU4mFEFZf+ZEWoO1a8Hmh3ZOI2F5ihCv2C4u/ARj6wDgtUla0p1mt/ut+UqRJ5H7VucJgUJ5fGkOLjyPHnLh9B2fHjYq9rEniDbjh0mcHA3IcrqdTMKWRSBT9YlgUymVfTOMncIJK3KKSTLoteqOKAMzj9erkhhu7qo75bWMKSuU2B4sVCf3yRqEYt0cSYcFIenowg1FQRo2j0SJrCe+rA+gHSoK56ecY9+wAMlX/jU7d4Ugzyg289OF5IbaLRdm65TWJxlC6uhhLVzQIDAQAB";
    /**
     *  支付宝签名 目前是 RSA2
     */
    public static String signType = "RSA2";

    /**
     *  页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    public static String return_url = "http://127.0.0.1:9999/swagger-ui.html#!/order-controller/showByIdUsingGET";

    public static AlipayClient getAlipayClient() {
        // 获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.serverUrl, AlipayConfig.appId, AlipayConfig.privateKey, AlipayConfig.format, AlipayConfig.charset, AlipayConfig.publicKey, AlipayConfig.signType);
        return alipayClient;
    }

}

