package com.lut.shopping.mapper;

import com.lut.shopping.bean.Logistic;
import com.lut.shopping.bean.LogisticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticMapper {
    long countByExample(LogisticExample example);

    int deleteByExample(LogisticExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Logistic record);

    int insertSelective(Logistic record);

    List<Logistic> selectByExample(LogisticExample example);

    Logistic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Logistic record, @Param("example") LogisticExample example);

    int updateByExample(@Param("record") Logistic record, @Param("example") LogisticExample example);

    int updateByPrimaryKeySelective(Logistic record);

    int updateByPrimaryKey(Logistic record);
}