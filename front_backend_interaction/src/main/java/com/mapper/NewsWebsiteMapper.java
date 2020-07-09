package com.mapper;

import com.bean.NewsWebsite;
import com.bean.NewsWebsiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsWebsiteMapper {
    long countByExample(NewsWebsiteExample example);

    int deleteByExample(NewsWebsiteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsWebsite record);

    int insertSelective(NewsWebsite record);

    List<NewsWebsite> selectByExample(NewsWebsiteExample example);

    NewsWebsite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsWebsite record, @Param("example") NewsWebsiteExample example);

    int updateByExample(@Param("record") NewsWebsite record, @Param("example") NewsWebsiteExample example);

    int updateByPrimaryKeySelective(NewsWebsite record);

    int updateByPrimaryKey(NewsWebsite record);
}