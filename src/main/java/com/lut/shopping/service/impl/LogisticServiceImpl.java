package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.LoEx;
import com.lut.shopping.bean.Ex.LogisticEx;
import com.lut.shopping.mapper.Ex.LoExMapper;
import com.lut.shopping.mapper.Ex.LogisticExMapper;
import com.lut.shopping.mapper.LogisticMapper;
import com.lut.shopping.service.ILogisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticServiceImpl implements ILogisticService {
    @Autowired
    private LogisticMapper logisticMapper;
    @Autowired
    private LoExMapper loExMapper;

    @Override
    public List<LoEx> selectAll() throws RuntimeException{
        List<LoEx> loExes = loExMapper.selectAll();
        return loExes;
    }
}
