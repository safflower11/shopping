package com.lut.shopping.service;

import com.lut.shopping.bean.User;

import java.util.Map;

public interface IUserService {
    User selectByUserName(Map<String, Object> map) throws RuntimeException;

    boolean addUser(User user) throws RuntimeException;
}
