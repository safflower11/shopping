package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.Count;
import com.lut.shopping.bean.Ex.Price;
import com.lut.shopping.mapper.ex.CountMappeer;
import com.lut.shopping.service.ICountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountServiceImpl implements ICountService {
    @Autowired
    private CountMappeer countMappeer;

    @Override
    public List<Count> countByOrderId() throws RuntimeException {

        return countMappeer.countByOrderId();
    }

    @Override
    public Price findPrice(int id) throws RuntimeException {
        return countMappeer.findPrice(id);
    }
}
