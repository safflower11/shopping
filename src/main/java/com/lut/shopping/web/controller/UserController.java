package com.lut.shopping.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.lut.shopping.annotation.UserLoginToken;
import com.lut.shopping.bean.Ex.SEX;
import com.lut.shopping.bean.Ex.UserEX;
import com.lut.shopping.bean.User;
import com.lut.shopping.service.IQsnService;
import com.lut.shopping.service.ITokenService;
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

    @Autowired
    private ITokenService tokenService;
    @Autowired
    private IQsnService qsnService;
    /*
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

     */
   @GetMapping("/adduser")
    @ApiImplicitParam(name = "repassword", value = "再次输入密码",paramType = "query",dataType = "String")
    public Message addUser(User user,String repassword){
        System.out.println(user.getPassword());
        System.out.println(repassword);
        boolean b1 = repassword.equals(user.getPassword());

        if(repassword.equals(user.getPassword())){
            userService.addUser(user);

            return MessageUtil.success("注册成功");
        }else {
            return MessageUtil.success("两次密码输入不一致");
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

    //登录
    @PostMapping("/loginByToken")
    public Object login(@RequestBody UserEX user){
        JSONObject jsonObject=new JSONObject();
        UserEX userForBase=userService.findByUsername(user);
        if(userForBase==null){
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject;
        }else {
            if (!userForBase.getPassword().equals(user.getPassword())){
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject;
            }else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }
    }
    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }

    @GetMapping("/qsn")
    @ApiOperation(value = "查看店铺评分")
    public Message get(int id){
        List<SEX> selectscore = qsnService.selectscore(id);
        return MessageUtil.success(selectscore);
    }

    @GetMapping("/forgetpass")
    @ApiOperation(value ="修改密码" )
    public Message forgetPass(int unum,String question,String answer,String pass,String repass){
       if(pass.equals(repass)){
           userService.goPass2(unum,question,answer,pass);
           return MessageUtil.success("修改密码成功");
       }else {
           return MessageUtil.success("修改密码失败");
       }

    }


}
