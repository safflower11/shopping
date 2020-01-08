package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.UserE;
import com.lut.shopping.bean.Ex.UserEX;

public interface ITokenService {
    public String getToken(UserE user) throws RuntimeException;

}
