package com.lut.shopping.service.impl;

import com.lut.shopping.bean.User;
import com.lut.shopping.mapper.UserMapper;
import com.lut.shopping.mapper.ex.UserEXMapper;
import com.lut.shopping.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserEXMapper userEXMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectByUserName(Map<String, Object> map) throws RuntimeException {
        return userEXMapper.selectByUserName(map);
    }

    @Override
    public boolean addUser(User user) throws RuntimeException {
        if(user==null){
            throw new RuntimeException("参数错误");
        }
        if(user.getId()==null){
            return userEXMapper.addUser(user);
        }else {
            return false;
        }
    }
}
