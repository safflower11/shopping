package com.lut.shopping.service.impl;

import com.lut.shopping.bean.*;
import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.bean.Ex.LogisticEx;
import com.lut.shopping.bean.Ex.OrderEXx;
import com.lut.shopping.bean.Ex.OrderEx;
import com.lut.shopping.mapper.*;
import com.lut.shopping.mapper.Ex.CoExMapper;
import com.lut.shopping.mapper.Ex.CommodityExMapper;
import com.lut.shopping.mapper.Ex.OrderEXxMapper;
import com.lut.shopping.mapper.ex.OrderExMapper;
import com.lut.shopping.service.IOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderExMapper orderExMapper;
    @Autowired
    private OrderEXxMapper orderEXxMapper;
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
    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired
    private AddressMapper addressMapper;
    //订单显示（向买家展示订单信息）
    @Override
    public List<CoEx> findAll() throws RuntimeException {
        List<CoEx> list= coExMapper.selectAll();
        return list;
    }
    //订单显示- 删除（根据订单Id删除订单信息）
    @Override
    public void deleteById(int id) throws RuntimeException {
        CoExample coExample = new CoExample();
        coExample.createCriteria().andOrderIdEqualTo(id);
        coMapper.deleteByExample(coExample);

        Order order = orderMapper.selectByPrimaryKey(id);
        System.out.println("物流id:"+order.getLogisticId());
        Logistic logistic = logisticMapper.selectByPrimaryKey(order.getLogisticId());
        logisticMapper.deleteByPrimaryKey(logistic.getId());

        PayExample payExample=new PayExample();
        payExample.createCriteria().andOrderIdEqualTo(id);
        payMapper.deleteByExample(payExample);
        orderMapper.deleteByPrimaryKey(id);
    }
    //订单显示- 预览（根据订单id浏览订单详细信息）
    @Override
    public OrderEx findById(int id) throws RuntimeException {
         return orderExMapper.findById(id);
    }
    //订单显示- 确认收货
    @Override
    public void receiveById(int id) throws RuntimeException {
        Order order = orderMapper.selectByPrimaryKey(id);
        if("已发货".equals(order.getStatus())) {
            Logistic logistic = logisticMapper.selectByPrimaryKey(order.getLogisticId());
            System.out.println(order.getLogisticId());
            System.out.println(logistic.getId());
            logistic.setStatus("已完成");
            logistic.setDeliverdate(new Date());
            logisticMapper.updateByPrimaryKey(logistic);

            order.setStatus("已完成");
        }else{
            throw new RuntimeException("异常信息！");
        }
        orderMapper.updateByPrimaryKey(order);
    }
    //订单监控（向卖家展示所有订单信息）
    @Override
    public List<OrderEXx> selectAll() throws RuntimeException {
        List<OrderEXx> list= orderEXxMapper.selectAll();
        return list;
    }
    //订单监控 - 浏览
    @Override
    public List<OrderEXx> selectById(int id) throws RuntimeException {
        return orderEXxMapper.selectById(id);
    }


    //订单监控 - 确认发货
    @Override
    public void deliverById(int id) throws RuntimeException {
        Order order = orderMapper.selectByPrimaryKey(id);
        int order_id=order.getId();
        Co co=orderEXxMapper.selectcommodity(order_id);
        int commodity_id=co.getCommodityId();
        Commodity commodity=orderEXxMapper.selectid(commodity_id);

        String name=commodity.getName();
        int beforenumber=commodity.getNumber();
        int ordernum=order.getNumber();
        if(ordernum>beforenumber){
            throw new RuntimeException("商品数量不够，不能发货");
        }else {
            if ("待发货".equals(order.getStatus())) {
                order.setStatus("已发货");
                System.out.println(order.getStatus());
                int number = order.getNumber();
                int afternumber = beforenumber - number;
                commodity.setNumber(afternumber);

                Logistic logistic = logisticMapper.selectByPrimaryKey(order.getLogisticId());
                System.out.println(order.getLogisticId());
                System.out.println(logistic.getId());
                logistic.setStatus("已发货");
                logistic.setDeliverdate(new Date());
                logisticMapper.updateByPrimaryKey(logistic);

                commodityMapper.updateByPrimaryKey(commodity);
                orderMapper.updateByPrimaryKey(order);
            }
        }
    }


    @Override
    public Co selectorder(int order_id) throws RuntimeException {
        Co co=orderEXxMapper.selectcommodity(order_id);
        return co;
    }

    @Override
    public Commodity selectid(int commodity_id) throws RuntimeException {
        Commodity commodity=orderEXxMapper.selectid(commodity_id);
        return commodity;
    }
    //订单监控 - 编辑（更改发货地址、发件人、联系电话）
    @Override
    public void update(String adeliveraddress, String adelivername, String adiliverphone) throws RuntimeException {
        Address address=new Address();
        address.setDeliveraddress(adeliveraddress);
        address.setDelivername(adelivername);
        address.setDeliverphone(adiliverphone);
    }

    @Override
    public Order findorderId(int order_id) {
       return orderMapper.selectByPrimaryKey(order_id);
    }

    @Override
    public Address findadress(int address_id) {
        return addressMapper.selectByPrimaryKey(address_id);
    }

    //订单监控 - 根据关键字和下拉框搜索
    @Override
    public List<OrderEXx> search(String key, String word) throws RuntimeException {
        word = word== null ? "" :word;
        if ((key == null || "".equals(key) ) && (word == null || "".equals(word))){
            return selectAll();
        }else if((key==null || "".equals(key)) && !"".equals(word)){
            word="%" + word +"%";
            return orderEXxMapper.selectStatusOrCode(word);
        }else if ("status".equals(key)){
            word="%" + word +"%";
            return orderEXxMapper.selectStatus(word);
        }else if ("code".equals(key)){
            word="%" + word +"%";
            return orderEXxMapper.selectCode(word);
        }
        return null;

    }

    @Override
    public List<OrderEx> findBy(int id) {
        return orderExMapper.findBy(id);
    }


}
