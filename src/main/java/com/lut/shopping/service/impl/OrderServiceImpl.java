package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.bean.Ex.OrderEx;
import com.lut.shopping.mapper.CoMapper;
import com.lut.shopping.mapper.Ex.CoExMapper;
import com.lut.shopping.mapper.Ex.OrderExMapper;
import com.lut.shopping.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderExMapper orderExMapper;

    @Override
    public OrderEx findById(int id) throws RuntimeException {
        return orderExMapper.findById(id);
    }
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
