package com.lut.shopping.mapper.ex;

import com.lut.shopping.bean.User;

import java.util.Map;

public interface UserEXMapper {
    User selectByUserName(Map<String, Object> map);
}
