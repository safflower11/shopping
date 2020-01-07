package com.lut.shopping.service;

import com.lut.shopping.bean.*;
import com.lut.shopping.bean.Ex.*;

import java.util.List;

public interface ICommodityService {
    List<CommodityEx> show() throws RuntimeException;
    void insert(Shoppingcar shoppingcar) throws RuntimeException;
    void addorder(int user_id,int num,double totalprice,int address_id,int logistic_id) throws RuntimeException;
    Commodity selectname(String name) throws RuntimeException;
    Logistic selectcompany(String company) throws RuntimeException;
    Address selectaddid(String getaddress,String receivename,String receivephone) throws RuntimeException;
    void insertaddresee(String getaddress, String receivename, String receivephone) throws RuntimeException;
    List<CommodityshowEx> commodityshow() throws RuntimeException;
    void insertcs(int shop_id,int commodity_id) throws RuntimeException;
    Shop selectshop(String shopname) throws RuntimeException;
    Cs selectcs(int shop_id,int commodity_id) throws RuntimeException;
    Repertory selere(String name) throws RuntimeException;
    void updateco(int afternum) throws RuntimeException;
    void updatere(int afterrnum) throws RuntimeException;
    void insertco(String name, int number,double price,String type,double discount) throws RuntimeException;
    Order selectmax() throws RuntimeException;
    void addco(int commodity_id,int order_id) throws RuntimeException;
    void under(int id) throws RuntimeException;
    List<Comone> showone(String name);
    List<LeaguerEx> showleaguer() throws RuntimeException;
    User selectById(int user_id) throws RuntimeException;
    List<CommodityAll> selectallcom() throws RuntimeException;
    void addlogistic(String company) throws RuntimeException;
    void updatelogisticstatus(String status) throws RuntimeException;
}
