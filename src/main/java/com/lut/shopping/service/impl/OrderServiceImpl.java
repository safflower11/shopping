package com.lut.shopping.service.impl;

import com.lut.shopping.bean.*;
import com.lut.shopping.bean.Ex.CoEx;
import com.lut.shopping.bean.Ex.OrderEXx;
import com.lut.shopping.bean.Ex.OrderEx;
import com.lut.shopping.mapper.*;
import com.lut.shopping.mapper.Ex.CoExMapper;
import com.lut.shopping.mapper.Ex.CommodityExMapper;
import com.lut.shopping.mapper.Ex.OrderEXxMapper;
import com.lut.shopping.mapper.Ex.OrderExMapper;
import com.lut.shopping.service.IOrderService;
<<<<<<< HEAD

=======
>>>>>>> f6d2d86c99928475fc315d5359ed86fef880f44a
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
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


        PayExample payExample=new PayExample();
        payExample.createCriteria().andOrderIdEqualTo(id);
        payMapper.deleteByExample(payExample);
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public OrderEx findById(int id) throws RuntimeException {
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



    @Override
    public List<OrderEXx> selectAll() throws RuntimeException {
        List<OrderEXx> list= orderEXxMapper.selectAll();
        return list;
    }

    @Override
    public List<OrderEXx> selectById(int id) throws RuntimeException {
        return orderEXxMapper.selectById(id);
    }



    @Override
    public void deliverById(int id) throws RuntimeException {
        Order order = orderMapper.selectByPrimaryKey(id);
        int order_id=order.getId();
        Co co=orderEXxMapper.selectcommodity(order_id);
        int commodity_id=co.getCommodityId();
        Commodity commodity=orderEXxMapper.selectid(commodity_id);
        String name=commodity.getName();
        int beforenumber=commodity.getNumber();
        if ("待发货".equals(order.getStatus())) {
            order.setStatus("已发货");
            int number = order.getNumber();
            int afternumber = beforenumber - number;
            commodity.setNumber(afternumber);
            commodityMapper.updateByPrimaryKey(commodity);
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


}
