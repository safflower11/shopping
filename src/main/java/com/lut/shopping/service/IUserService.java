package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.UserEX;
import com.lut.shopping.bean.User;

import java.util.Map;

public interface IUserService {
    User selectByUserName(Map<String, Object> map) throws RuntimeException;

    boolean addUser(User user, Integer leaguer) throws RuntimeException;

    UserEX showById(int id) throws RuntimeException;


    void shenhe(int unum, String shopname)throws RuntimeException;

    UserEX findByUnum(int unum)throws RuntimeException;

    UserEX findByUsername(UserEX user) throws RuntimeException;

    UserEX findUserById(String userId) throws RuntimeException;

    User goPass(int unum, String question, String answer);

    User goPass2(int unum, String question, String answer,String password);
}
