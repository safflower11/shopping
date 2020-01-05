package com.lut.shopping.service;

import com.lut.shopping.bean.Ex.CoEx;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IShopService {
    List<CoEx> findAll() throws RuntimeException;
    void deleteById(int id) throws RuntimeException;
}
