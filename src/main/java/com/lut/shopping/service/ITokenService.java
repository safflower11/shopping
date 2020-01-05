package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.UserEX;

public interface ITokenService {
    public String getToken(UserEX user) throws RuntimeException;

}
