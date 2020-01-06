package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.CommodityshowEx;
import com.lut.shopping.bean.Ex.ShoppingcarEx;
import com.lut.shopping.bean.Shoppingcar;
import com.lut.shopping.mapper.*;
import com.lut.shopping.mapper.Ex.CommodityExMapper;
import com.lut.shopping.service.IShoppingcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingcarServiceImpl implements IShoppingcarService {
    @Autowired
    private CommodityExMapper commodityExMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired
    private CoMapper coMapper;
    @Autowired
    private CsMapper csMapper;
    @Autowired
    private ShoppingcarMapper shoppingcarMapper;

    @Override
    public List<ShoppingcarEx> showshopcar(int user_id) throws RuntimeException {
        List<ShoppingcarEx> shoppingcarExes=commodityExMapper.showshopcar(user_id);
        return shoppingcarExes;
    }

    @Override
    public void delete(int id) throws RuntimeException {
        shoppingcarMapper.deleteByPrimaryKey(id);
    }
}
