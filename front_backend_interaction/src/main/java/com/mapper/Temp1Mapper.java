package com.mapper;

import com.bean.Temp1;
import com.bean.Temp1Example;
import com.bean.Temp1WithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Temp1Mapper {
    long countByExample(Temp1Example example);

    int deleteByExample(Temp1Example example);

    int deleteByPrimaryKey(Integer newsId);

    int insert(Temp1WithBLOBs record);

    int insertSelective(Temp1WithBLOBs record);

    List<Temp1WithBLOBs> selectByExampleWithBLOBs(Temp1Example example);

    List<Temp1> selectByExample(Temp1Example example);

    Temp1WithBLOBs selectByPrimaryKey(Integer newsId);

    int updateByExampleSelective(@Param("record") Temp1WithBLOBs record, @Param("example") Temp1Example example);

    int updateByExampleWithBLOBs(@Param("record") Temp1WithBLOBs record, @Param("example") Temp1Example example);

    int updateByExample(@Param("record") Temp1 record, @Param("example") Temp1Example example);

    int updateByPrimaryKeySelective(Temp1WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(Temp1WithBLOBs record);

    int updateByPrimaryKey(Temp1 record);
}