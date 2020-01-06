package com.lut.shopping.mapper;

import com.lut.shopping.bean.Lo;
import com.lut.shopping.bean.LoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoMapper {
    long countByExample(LoExample example);

    int deleteByExample(LoExample example);

    int insert(Lo record);

    int insertSelective(Lo record);

    List<Lo> selectByExample(LoExample example);

    int updateByExampleSelective(@Param("record") Lo record, @Param("example") LoExample example);

    int updateByExample(@Param("record") Lo record, @Param("example") LoExample example);
}