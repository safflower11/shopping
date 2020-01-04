package com.lut.shopping.web.controller;

import com.lut.shopping.bean.User;
import com.lut.shopping.service.IUserService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Api(description = "用户管理")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/login")
    public Message findByUsername(
            @RequestParam(value = "用户名", required = false) String userName,
            @RequestParam(value = "密码", required = false) String password,
            @RequestParam(value = "身份编号", required = false) String code) {
        Map<String,Object> map = new HashMap<>();
        map.put("unum",userName);
        map.put("password",password);
        map.put("code",code);
        User user = userService.selectByUserName(map);
        if(user==null){
            return MessageUtil.success("用户名或密码或身份编号错误");

        }else {
            return MessageUtil.success(user);
        }
    }


}
