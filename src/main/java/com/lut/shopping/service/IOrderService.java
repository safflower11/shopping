package com.lut.shopping.service;

import com.lut.shopping.bean.Address;
import com.lut.shopping.bean.Co;
import com.lut.shopping.bean.Commodity;
import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.bean.Ex.OrderEXx;
import com.lut.shopping.bean.Ex.OrderEx;
import com.lut.shopping.bean.Order;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IOrderService {
    List<CoEx> findAll() throws RuntimeException;
    void deleteById(int id) throws RuntimeException;
    OrderEx findById(int id) throws RuntimeException;
    void receiveById(int id) throws RuntimeException;
    List<OrderEXx> selectAll() throws RuntimeException;
    List<OrderEXx> selectById(int id) throws RuntimeException;
    void deliverById(int id) throws RuntimeException;

    Co selectorder(int order_id) throws RuntimeException;
    Commodity selectid(int commodity_id) throws RuntimeException;
    void update(String adeliveraddress, String delivername, String diliverphone) throws RuntimeException;

    Order findorderId(int order_id);
    Address findadress(int address_id);

    List<OrderEXx> search(String key,String word) throws RuntimeException;

}
