package com.mapper;

import com.bean.EventsInfo;
import com.bean.EventsInfoExample;
import com.bean.EventsInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsInfoMapper {
    long countByExample(EventsInfoExample example);

    int deleteByExample(EventsInfoExample example);

    int deleteByPrimaryKey(Integer eventId);

    int insert(EventsInfoWithBLOBs record);

    int insertSelective(EventsInfoWithBLOBs record);

    List<EventsInfoWithBLOBs> selectByExampleWithBLOBs(EventsInfoExample example);

    List<EventsInfo> selectByExample(EventsInfoExample example);

    EventsInfoWithBLOBs selectByPrimaryKey(Integer eventId);

    int updateByExampleSelective(@Param("record") EventsInfoWithBLOBs record, @Param("example") EventsInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsInfoWithBLOBs record, @Param("example") EventsInfoExample example);

    int updateByExample(@Param("record") EventsInfo record, @Param("example") EventsInfoExample example);

    int updateByPrimaryKeySelective(EventsInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EventsInfoWithBLOBs record);

    int updateByPrimaryKey(EventsInfo record);
}