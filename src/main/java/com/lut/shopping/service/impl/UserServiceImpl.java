package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.UserE;
import com.lut.shopping.bean.Ex.UserEX;
import com.lut.shopping.bean.Shop;
import com.lut.shopping.bean.User;
import com.lut.shopping.mapper.ShopMapper;
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
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public User selectByUserName(Map<String, Object> map) throws RuntimeException {
        return userEXMapper.selectByUserName(map);
    }

    @Override
    public boolean addUser(User user, Integer leaguer) throws RuntimeException {
        if(user==null){
            throw new RuntimeException("参数错误");
        }
        //boolean b = password == user.getPassword();
        //System.out.println(b);
        if(user.getId()==null&&leaguer==null){
            user.setCode(3);
            user.setMember(0.00);
            userMapper.insert(user);
            return true;
        }else if (user.getId()==null&&!"".equals(leaguer)) {
            user.setCode(4);
            user.setMember(200.00);
            userMapper.insert(user);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public UserEX showById(int id) throws RuntimeException {
        return userEXMapper.showById(id);
    }

    @Override
    public void shenhe(int unum, String shopname) throws RuntimeException{
        UserEX userEX = findByUnum(unum);
        Shop shop = new Shop();
        if(userEX.getUnum()==unum){
            userEX.setCode(2);
            userEXMapper.updateById(userEX);
            shop.setName(shopname);
            Integer id = userEX.getId();
            shop.setUserId(id);
            shopMapper.insert(shop);
        }

    }

    @Override
    public UserEX findByUnum(int unum) throws RuntimeException {
        return userEXMapper.findByUnum(unum);
    }

    @Override
    public UserE findByUsername(UserE user) throws RuntimeException {
        return userEXMapper.findByUsername(user.getUnum());
    }

    @Override
    public UserE findUserById(String userId) throws RuntimeException {
        return userEXMapper.findUserById(userId);
    }

    @Override
    public User goPass(int unum, String question, String answer) {
        return userEXMapper.goPass(unum,question,answer);
    }

    @Override
    public User goPass2(int unum, String question, String answer,String password) {
        User user = goPass(unum, question, answer);

        user.setPassword(password);

        userMapper.updateByPrimaryKey(user);
        return user;
    }

}
