package com.lut.shopping.mapper;

import com.lut.shopping.bean.Repertory;
import com.lut.shopping.bean.RepertoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepertoryMapper {
    long countByExample(RepertoryExample example);

    int deleteByExample(RepertoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Repertory record);

    int insertSelective(Repertory record);

    List<Repertory> selectByExample(RepertoryExample example);

    Repertory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Repertory record, @Param("example") RepertoryExample example);

    int updateByExample(@Param("record") Repertory record, @Param("example") RepertoryExample example);

    int updateByPrimaryKeySelective(Repertory record);

    int updateByPrimaryKey(Repertory record);
}