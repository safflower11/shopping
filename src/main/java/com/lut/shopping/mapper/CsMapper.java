package com.lut.shopping.mapper;

import com.lut.shopping.bean.Cs;
import com.lut.shopping.bean.CsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsMapper {
    long countByExample(CsExample example);

    int deleteByExample(CsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cs record);

    int insertSelective(Cs record);

    List<Cs> selectByExample(CsExample example);

    Cs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cs record, @Param("example") CsExample example);

    int updateByExample(@Param("record") Cs record, @Param("example") CsExample example);

    int updateByPrimaryKeySelective(Cs record);

    int updateByPrimaryKey(Cs record);
}