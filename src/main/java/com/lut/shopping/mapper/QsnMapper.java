package com.lut.shopping.mapper;

import com.lut.shopping.bean.Qsn;
import com.lut.shopping.bean.QsnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QsnMapper {
    long countByExample(QsnExample example);

    int deleteByExample(QsnExample example);

    int insert(Qsn record);

    int insertSelective(Qsn record);

    List<Qsn> selectByExample(QsnExample example);

    int updateByExampleSelective(@Param("record") Qsn record, @Param("example") QsnExample example);

    int updateByExample(@Param("record") Qsn record, @Param("example") QsnExample example);
}