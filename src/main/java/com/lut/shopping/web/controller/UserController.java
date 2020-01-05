package com.lut.shopping.web.controller;

import com.lut.shopping.bean.Ex.UserEX;
import com.lut.shopping.bean.User;
import com.lut.shopping.service.IUserService;
import com.lut.shopping.util.Message;
import com.lut.shopping.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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
    @GetMapping("/adduser")
    @ApiImplicitParam(name = "repassword", value = "再次输入密码",paramType = "query",dataType = "String")
    public Message addUser(User user,String repassword){
        System.out.println(user.getPassword());
        System.out.println(repassword);
        boolean b1 = repassword == user.getPassword();
        System.out.println("杀杀杀"+b1);
        if(repassword==user.getPassword()){
            boolean b = userService.addUser(user);
            if (b==true){
                return MessageUtil.success("注册成功");
            }else {
                return MessageUtil.success("两次密码输入不一致");
            }
        }else {
            return MessageUtil.success("注册失败");
        }


    }

    @GetMapping("/showById")
    @ApiOperation(value = "用户显示")
    public Message showById(int id) {
        UserEX userEX = userService.showById(id);
        return MessageUtil.success(userEX);
    }

    @PostMapping("/shenhe")
    @ApiOperation(value = "审核用户")
    public Message shehe(int unum,String shopname) {
        userService.shenhe(unum,shopname);
        return MessageUtil.success();
    }


}
