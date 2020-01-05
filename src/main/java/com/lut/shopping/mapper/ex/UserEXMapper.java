package com.lut.shopping.mapper.ex;

import com.lut.shopping.bean.Ex.UserEX;
import com.lut.shopping.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserEXMapper {
    User selectByUserName(Map<String, Object> map);

    boolean addUser(User user);

    UserEX showById(int id);

    UserEX findByUnum(int unum);

    void updateById(UserEX userEX);

    UserEX findByUsername(@Param("username") int username);
    UserEX findUserById(@Param("Id") String Id);
}
