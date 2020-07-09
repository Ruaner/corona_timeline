package com.mapper;

import com.bean.CateInfo;
import com.bean.CateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CateInfoMapper {
    long countByExample(CateInfoExample example);

    int deleteByExample(CateInfoExample example);

    int deleteByPrimaryKey(Integer cateId);

    int insert(CateInfo record);

    int insertSelective(CateInfo record);

    List<CateInfo> selectByExample(CateInfoExample example);

    CateInfo selectByPrimaryKey(Integer cateId);

    int updateByExampleSelective(@Param("record") CateInfo record, @Param("example") CateInfoExample example);

    int updateByExample(@Param("record") CateInfo record, @Param("example") CateInfoExample example);

    int updateByPrimaryKeySelective(CateInfo record);

    int updateByPrimaryKey(CateInfo record);
}