package com.lut.shopping.mapper.Ex;

import com.lut.shopping.bean.*;
import com.lut.shopping.bean.Ex.*;


import java.util.List;

public interface CommodityExMapper {
    List<CommodityEx> selectshow();
    void insertshopcar(Shoppingcar shoppingcar);
    Commodity selectName(String name);
    Logistic selectcom(String company);
    Address selectadd(String getaddress,String receivename,String receivephone);
    Cs selectcs(int shop_id,int commodity_id);
    void insertaddress(String getaddress,String receivename,String receivephone);
    List<CommodityshowEx> selectcommodity();
    void insertcs(Cs cs);
    Shop selectshop(String shopname);
    Repertory selectrepertory(String name);
    Order selectmax();
    Logistic findmax();
    List<Comone> showone(String name);
    List<ShoppingcarEx> showshopcar(int user_id);
    User selectById(int id);
    List<LeaguerEx> selectleaguer();
    List<CommodityAll> selectallcom();
    void deleteBy(int commodity_id, int shop_id);
}
