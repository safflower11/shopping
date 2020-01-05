package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.mapper.CoMapper;
import com.lut.shopping.mapper.Ex.CoExMapper;
import com.lut.shopping.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements IShopService {
    @Autowired
    private CoExMapper coExMapper;
    @Autowired
    private CoMapper coMapper;
    @Override
    public List<CoEx> findAll() throws RuntimeException {
       List<CoEx> list= coExMapper.selectAll();
        return list;
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        coMapper.deleteByPrimaryKey(id);
    }
}
