package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.LogisticEx;
import com.lut.shopping.mapper.Ex.LogisticExMapper;
import com.lut.shopping.mapper.LogisticMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticServiceImpl {
    @Autowired
    private LogisticExMapper logisticExMapper;
    @Autowired
    private LogisticMapper logisticMapper;

    @Override
    public List<LogisticEx> selectAll() throws RuntimeException{
        List<LogisticEx> logisticExes = logisticExMapper.selectAll();
        return logisticExes;
    }
}
