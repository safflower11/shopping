package com.lut.shopping.service.impl;

import com.lut.shopping.bean.Ex.LogisticResultEx;
import com.lut.shopping.bean.Logistic;
import com.lut.shopping.mapper.Ex.LogisticResultExMapper;
import com.lut.shopping.mapper.LogisticMapper;
import com.lut.shopping.service.ILogisticResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LogisticResultServiceImpl implements ILogisticResultService {
    @Autowired
    private LogisticResultExMapper logisticResultExMapper;
    @Autowired
    private LogisticMapper logisticMapper;

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
    @Override
    public Logistic insert(String company, int code, String status, Date getdate, Date deliverdate) throws RuntimeException{
        Logistic logistic = new Logistic();
        logistic.setCompany(company);
        logistic.setStatus(status);
        logistic.setGetdate(getdate);
        logistic.setDeliverdate(deliverdate);
        logistic.setCode(code);
        logisticMapper.insert(logistic);
        return logistic;
    }
    @Override
    public void deleteById(int id){
        logisticMapper.deleteByPrimaryKey(id);
    }

}
