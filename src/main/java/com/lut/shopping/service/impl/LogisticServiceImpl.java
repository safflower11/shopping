package com.lut.shopping.service.impl;

import com.lut.shopping.mapper.LogisticMapper;
import com.lut.shopping.service.ILogisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticServiceImpl implements ILogisticService {
    @Autowired
    private LogisticMapper logisticMapper;



}
