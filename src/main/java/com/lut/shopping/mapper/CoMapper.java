package com.lut.shopping.mapper;

import com.lut.shopping.bean.Co;
import com.lut.shopping.bean.CoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoMapper {
    long countByExample(CoExample example);

    int deleteByExample(CoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Co record);

    int insertSelective(Co record);

    List<Co> selectByExample(CoExample example);

    Co selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Co record, @Param("example") CoExample example);

    int updateByExample(@Param("record") Co record, @Param("example") CoExample example);

    int updateByPrimaryKeySelective(Co record);

    int updateByPrimaryKey(Co record);


}