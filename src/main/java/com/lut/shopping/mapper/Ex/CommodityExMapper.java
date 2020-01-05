package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.*;
import com.lut.shopping.bean.Ex.CommodityEx;
import com.lut.shopping.bean.Ex.CommodityshowEx;


import java.util.List;

public interface CommodityExMapper {
    List<CommodityEx> selectshow();
    void insertshopcar(Shoppingcar shoppingcar);
    Commodity selectName(String name);
    Logistic selectcom(String company);
    Address selectadd(String getaddress,String receivename,String receivephone);
    Cs selectcs(int shop_id,int commodity_id);
    Address insertaddress(String getaddress,String receivename,String receivephone);
    List<CommodityshowEx> selectcommodity();
    void insertcs(Cs cs);
    Shop selectshop(String shopname);
    Repertory selectrepertory(String name);
    void update(CommodityshowEx commodityshowEx);
    void updatere(Repertory repertory);
}
