package com.mapper;

import com.bean.NewsInfoPre;
import com.bean.NewsInfoPreExample;
import com.bean.NewsInfoPreWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsInfoPreMapper {
    long countByExample(NewsInfoPreExample example);

    int deleteByExample(NewsInfoPreExample example);

    int deleteByPrimaryKey(Integer newsId);

    int insert(NewsInfoPreWithBLOBs record);

    int insertSelective(NewsInfoPreWithBLOBs record);

    List<NewsInfoPreWithBLOBs> selectByExampleWithBLOBs(NewsInfoPreExample example);

    List<NewsInfoPre> selectByExample(NewsInfoPreExample example);

    NewsInfoPreWithBLOBs selectByPrimaryKey(Integer newsId);

    int updateByExampleSelective(@Param("record") NewsInfoPreWithBLOBs record, @Param("example") NewsInfoPreExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsInfoPreWithBLOBs record, @Param("example") NewsInfoPreExample example);

    int updateByExample(@Param("record") NewsInfoPre record, @Param("example") NewsInfoPreExample example);

    int updateByPrimaryKeySelective(NewsInfoPreWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsInfoPreWithBLOBs record);

    int updateByPrimaryKey(NewsInfoPre record);
}