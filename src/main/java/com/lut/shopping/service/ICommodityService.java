package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.CommodityEx;

import java.util.List;

public interface ICommodityService {
    List<CommodityEx> show() throws RuntimeException;
}
