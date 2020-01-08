package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.Count;
import com.lut.shopping.bean.Ex.Price;
import com.lut.shopping.mapper.Ex.CountMappeer;
import com.lut.shopping.service.ICountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountServiceImpl implements ICountService {
    @Autowired
    private CountMappeer countMappeer;

    @Override
    public List<Count> countByOrderId(int id, int year, int month) throws RuntimeException {
        return countMappeer.countByOrderId(id,year,month);
    }

    @Override
    public Price findPrice(int id,int year,int month) throws RuntimeException {
        Price price = countMappeer.findPrice(id,year,month);
        Price discount = countMappeer.findDiscount(id,year,month);
        if(price.getSumprice()==null||"".equals(price.getSumprice())){
            price.setSumprice(0.0);
        }
        if(discount.getSumprice()==null||"".equals(discount.getSumprice())){
            discount.setSumprice(0.0);
        }
        System.out.println("price:"+price.getSumprice());
        System.out.println("discount:"+discount.getSumprice());
        double v = price.getSumprice() + discount.getSumprice();
        price.setSumprice(v);
        System.out.println("sumprice:"+v);
        return price;
    }
}
