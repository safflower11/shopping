package com.lut.shopping.mapper.ex;

import com.lut.shopping.bean.Ex.UserEX;
import com.lut.shopping.bean.User;

import java.util.List;
import java.util.Map;

public interface UserEXMapper {
    User selectByUserName(Map<String, Object> map);

    boolean addUser(User user);

    UserEX showById(int id);

    UserEX findByUnum(int unum);

    void updateById(UserEX userEX);
}
