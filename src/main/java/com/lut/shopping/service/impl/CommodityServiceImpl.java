package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.CommodityEx;
import com.lut.shopping.bean.Order;
import com.lut.shopping.bean.Shoppingcar;
import com.lut.shopping.mapper.Ex.CommodityExMapper;
import com.lut.shopping.mapper.OrderMapper;
import com.lut.shopping.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements ICommodityService {
    @Autowired
    private CommodityExMapper commodityExMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<CommodityEx> show() throws RuntimeException {
        List<CommodityEx> commodityExes=commodityExMapper.selectshow();
        return commodityExes;
    }

    @Override
    public void insert(Shoppingcar shoppingcar) throws RuntimeException {
        commodityExMapper.insertshopcar(shoppingcar);
    }

    @Override
    public void addorder(Order order) throws RuntimeException {
        if(order==null){
            throw new RuntimeException("参数为空");
        }
        if(order.getId()==null){
            int code=(int) Math.round((Math.random()+1)*100000000);
            order.setStatus("已下单");
            order.setCode(code);
            orderMapper.insert(order);
        }else {
            orderMapper.updateByPrimaryKey(order);
        }
    }
}
