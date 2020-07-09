package com.mapper;

import com.bean.NewsInfo;
import com.bean.NewsInfoExample;
import com.bean.NewsInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsInfoMapper {
    long countByExample(NewsInfoExample example);

    int deleteByExample(NewsInfoExample example);

    int deleteByPrimaryKey(Integer newsId);

    int insert(NewsInfoWithBLOBs record);

    int insertSelective(NewsInfoWithBLOBs record);

    List<NewsInfoWithBLOBs> selectByExampleWithBLOBs(NewsInfoExample example);

    List<NewsInfo> selectByExample(NewsInfoExample example);

    NewsInfoWithBLOBs selectByPrimaryKey(Integer newsId);

    int updateByExampleSelective(@Param("record") NewsInfoWithBLOBs record, @Param("example") NewsInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsInfoWithBLOBs record, @Param("example") NewsInfoExample example);

    int updateByExample(@Param("record") NewsInfo record, @Param("example") NewsInfoExample example);

    int updateByPrimaryKeySelective(NewsInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsInfoWithBLOBs record);

    int updateByPrimaryKey(NewsInfo record);

    List<NewsInfoWithBLOBs> getMediaInfoByEventId(Integer id);
}