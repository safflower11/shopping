package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.mapper.CoMapper;
import com.lut.shopping.mapper.Ex.CoExMapper;
import com.lut.shopping.service.IShopService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements IShopService {
    private CoExMapper coExMapper;
    @Override
    public List<CoEx> findAll() throws RuntimeException {
       List<CoEx> list= coExMapper.selectAll();
        return list;
    }
}
