package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.Ex.UserE;
import com.lut.shopping.bean.Ex.UserEX;
import com.lut.shopping.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserEXMapper {
    User selectByUserName(Map<String, Object> map);

    boolean addUser(User user);

    UserEX showById(int id);

    UserEX findByUnum(int unum);

    void updateById(UserEX userEX);

    UserE findByUsername(@Param("username") int username);

    UserE findUserById(@Param("Id") String Id);

    User goPass(int unum, String question, String answer);

    User goPass2(int unum, String question, String answer);

}
