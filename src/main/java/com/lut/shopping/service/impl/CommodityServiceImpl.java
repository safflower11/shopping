package com.lut.shopping.service.impl;

import com.lut.shopping.bean.*;
import com.lut.shopping.bean.Ex.*;
import com.lut.shopping.mapper.*;
import com.lut.shopping.mapper.Ex.CommodityExMapper;
import com.lut.shopping.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CommodityServiceImpl implements ICommodityService {
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
    @Autowired
    private LogisticMapper logisticMapper;


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
    public void addorder(int user_id,int num,double totalprice,int address_id,int logistic_id) throws RuntimeException {
        Order order=new Order();
            int code=(int) Math.round((Math.random()+1)*100000000);
            order.setStatus("待付款");
            order.setCode(code);
            order.setOrderdate(new Date());
            order.setUserId(user_id);
            order.setNumber(num);
            order.setTotalprice(totalprice);
            order.setAddressId(address_id);
            order.setLogisticId(logistic_id);
            orderMapper.insert(order);

    }

    @Override
    public Commodity selectname(String name) throws RuntimeException {
           Commodity commodity=commodityExMapper.selectName(name);
            return commodity;
        }

    @Override
    public Logistic selectcompany(String company) throws RuntimeException {
        Logistic logistic=commodityExMapper.selectcom(company);
        return logistic;
    }

    @Override
    public Address selectaddid(String getaddress, String receivename, String receivephone) throws RuntimeException {
        Address address=commodityExMapper.selectadd(getaddress,receivename,receivephone);
        return address;
    }

    @Override
    public void insertaddresee(String getaddress, String receivename, String receivephone) throws RuntimeException {
        commodityExMapper.insertaddress(getaddress,receivename,receivephone);

    }

    @Override
    public List<CommodityshowEx> commodityshow() throws RuntimeException {
        List<CommodityshowEx> commodityshowExes=commodityExMapper.selectcommodity();
        return commodityshowExes;
    }

    @Override
    public void insertcs(int shop_id,int commodity_id) throws RuntimeException {
        Cs cs=new Cs();
        cs.setShop_id(shop_id);
        cs.setCommodity_id(commodity_id);
        commodityExMapper.insertcs(cs);
    }

    @Override
    public Shop selectshop(String shopname) throws RuntimeException {
        Shop shop=commodityExMapper.selectshop(shopname);
        return shop;
    }

    @Override
    public Cs selectcs(int shop_id, int commodity_id) throws RuntimeException {
        Cs cs=commodityExMapper.selectcs(shop_id,commodity_id);
        return cs;
    }

    @Override
    public Repertory selere(String name) throws RuntimeException {
        Repertory repertory=commodityExMapper.selectrepertory(name);
        return repertory;
    }


    @Override
    public void updateco(int afternum) throws RuntimeException {
        CommodityshowEx commodityshowEx=new CommodityshowEx();
        commodityshowEx.setNumber(afternum);
        commodityExMapper.update(commodityshowEx);

    }

    @Override
    public void updatere(int afterrnum) throws RuntimeException {
        Repertory repertory=new Repertory();
        repertory.setNumber(afterrnum);
        commodityExMapper.updatere(repertory);
    }

    @Override
    public void insertco(String name, int number,double price,String type,double discount) throws RuntimeException {
        Commodity commodity=new Commodity();
        commodity.setName(name);
        commodity.setNumber(number);
        commodity.setPrice(price);
        commodity.setType(type);
        commodity.setDiscount(discount);
        commodityMapper.insert(commodity);
    }

    @Override
    public Order selectmax() throws RuntimeException {
        Order order=commodityExMapper.selectmax();
        return order;
    }

    @Override
    public void addco(int commodity_id, int order_id) throws RuntimeException {
        Co co=new Co();
        co.setCommodityId(commodity_id);
        co.setOrderId(order_id);
        coMapper.insert(co);

    }

    @Override
    public void under(int id) throws RuntimeException {
        CoExample coExample = new CoExample();
        coExample.createCriteria().andCommodityIdEqualTo(id);
        coMapper.deleteByExample(coExample);
        CsExample csExample = new CsExample();
        csExample.createCriteria().andCommodityIdEqualTo(id);
        csMapper.deleteByExample(csExample);
        ShoppingcarExample shoppingcarExample=new ShoppingcarExample();
        shoppingcarExample.createCriteria().andCommodityIdEqualTo(id);
        shoppingcarMapper.deleteByExample(shoppingcarExample);
        commodityExMapper.deleteunder(id);

    }

    @Override
    public List<Comone> showone(String name) {
        List<Comone> comones=commodityExMapper.showone(name);
        return comones;
    }

    @Override
    public List<LeaguerEx> showleaguer() throws RuntimeException {
        List<LeaguerEx> leaguerExes=commodityExMapper.selectleaguer();
        return leaguerExes;
    }

    @Override
    public User selectById(int user_id) throws RuntimeException {
        User user=commodityExMapper.selectById(user_id);
        return user;
    }

    @Override
    public List<CommodityAll> selectallcom() throws RuntimeException {
        List<CommodityAll> commodityAlls=commodityExMapper.selectallcom();
        return commodityAlls;
    }

    @Override
    public void addlogistic(Logistic logistic) throws RuntimeException {
        int code=(int) Math.round((Math.random()+1)*1000);
        logistic.setCode(code);
        logisticMapper.insert(logistic);

    }
}
