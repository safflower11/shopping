package com.lut.shopping.service.impl;

import com.lut.shopping.bean.*;
import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.bean.Ex.OrderEx;
import com.lut.shopping.mapper.CoMapper;
import com.lut.shopping.mapper.Ex.CoExMapper;
import com.lut.shopping.mapper.Ex.OrderExMapper;
import com.lut.shopping.mapper.LogisticMapper;
import com.lut.shopping.mapper.OrderMapper;
import com.lut.shopping.mapper.PayMapper;
import com.lut.shopping.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderExMapper orderExMapper;
    @Autowired
    private CoExMapper coExMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private CoMapper coMapper;
    @Autowired
    private LogisticMapper logisticMapper;
    @Autowired
    private PayMapper payMapper;
    @Override
    public List<CoEx> findAll() throws RuntimeException {
        List<CoEx> list= coExMapper.selectAll();
        return list;
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        CoExample coExample = new CoExample();
        coExample.createCriteria().andOrderIdEqualTo(id);
        coMapper.deleteByExample(coExample);
        LogisticExample logisticExample1 = new LogisticExample();
        logisticExample1.createCriteria().andOrderIdEqualTo(id);
        logisticMapper.deleteByExample(logisticExample1);
        PayExample payExample=new PayExample();
        payExample.createCriteria().andOrderIdEqualTo(id);
        payMapper.deleteByExample(payExample);
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<OrderEx> findById(int id) throws RuntimeException {
        return orderExMapper.findById(id);
    }

    @Override
    public void receiveById(int id) throws RuntimeException {
        Order order = orderMapper.selectByPrimaryKey(id);
        if("已发货".equals(order.getStatus())) {
            order.setStatus("已完成");
        }else{
            throw new RuntimeException("异常信息！");
        }
        orderMapper.updateByPrimaryKey(order);
    }




}
