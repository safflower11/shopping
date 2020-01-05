package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.ShopEx;
import com.lut.shopping.bean.Ex.ShopResult;
import com.lut.shopping.bean.Shop;
import com.lut.shopping.mapper.ex.ShopEXMapper;
import com.lut.shopping.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl  implements IShopService {
    @Autowired
    private ShopEXMapper shopEXMapper;

    @Override
    public List<ShopResult> findAll() throws RuntimeException {
        return shopEXMapper.findAll();
    }
}
