package com.lut.shopping.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.lut.shopping.bean.Ex.UserEX;
import com.lut.shopping.service.ITokenService;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements ITokenService {

    @Override
    public String getToken(UserEX user) throws RuntimeException {
        String token="";
        String s=String.valueOf(user.getId());
        token= JWT.create().withAudience(s) // 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getPassword()));// 以 password 作为 token 的密钥
        return token;
    }
}
