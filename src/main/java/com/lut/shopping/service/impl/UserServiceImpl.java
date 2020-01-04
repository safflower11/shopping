package com.lut.shopping.service.impl;

import com.lut.shopping.bean.User;
import com.lut.shopping.mapper.ex.UserEXMapper;
import com.lut.shopping.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserEXMapper userEXMapper;
    @Override
    public User selectByUserName(Map<String, Object> map) throws RuntimeException {
        return userEXMapper.selectByUserName(map);
    }
}
