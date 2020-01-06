package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.LogisticEx;
import com.lut.shopping.mapper.Ex.LogisticExMapper;
import com.lut.shopping.mapper.LogisticMapper;
import com.lut.shopping.service.ILogisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticServiceImpl implements ILogisticService {
    @Autowired
    private LogisticExMapper logisticExMapper;

    @Override
    public List<LogisticEx> findAll() throws RuntimeException{
        List<LogisticEx> logisticExes = logisticExMapper.findAll();
        return logisticExes;
    }
    @Override
    public List<LogisticEx> findBy(String word) throws RuntimeException{
        List<LogisticEx> logisticExes = logisticExMapper.selectByWord(word);
        return logisticExes;
    }
    @Override
    public LogisticEx findById(int id) throws RuntimeException{
        return logisticExMapper.findById(id);
    }
}
