package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.LogisticResultEx;
import com.lut.shopping.mapper.Ex.LogisticResultExMapper;
import com.lut.shopping.service.ILogisticResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticResultServiceImpl implements ILogisticResultService {
    @Autowired
    private LogisticResultExMapper logisticResultExMapper;

    @Override
    public List<LogisticResultEx> findAll() throws RuntimeException {
        List<LogisticResultEx> logisticResultExes = logisticResultExMapper.findAll();
        return logisticResultExes;
    }

    @Override
    public List<LogisticResultEx> findBy(String word) throws RuntimeException {
        List<LogisticResultEx> logisticResultExes = logisticResultExMapper.selectByWord(word);
        return logisticResultExes;
    }

    @Override
    public LogisticResultEx findById(int id) throws RuntimeException {
        return logisticResultExMapper.findById(id);
    }
}
