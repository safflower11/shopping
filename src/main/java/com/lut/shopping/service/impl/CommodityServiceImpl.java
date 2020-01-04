package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.CommodityEx;
import com.lut.shopping.mapper.Ex.CommodityExMapper;
import com.lut.shopping.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements ICommodityService {
    @Autowired
    private CommodityExMapper commodityExMapper;

    @Override
    public List<CommodityEx> show() throws RuntimeException {
        List<CommodityEx> commodityExes=commodityExMapper.selectshow();
        return commodityExes;
    }
}
