package com.service.impl;

import com.bean.EventsInfoExample;
import com.bean.EventsInfoWithBLOBs;
import com.bean.NewsInfoExample;
import com.mapper.EventsInfoMapper;
import com.service.EventsInfoWithBLOBsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsInfoWithBLOBsServiceImpl implements EventsInfoWithBLOBsService {
    @Autowired
    EventsInfoMapper eventsInfoMapper;

    @Override
    public EventsInfoWithBLOBs getEventsInfoById(Integer id) {
        return eventsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<EventsInfoWithBLOBs> getEventsInfoWithBLOBs() {
        EventsInfoExample example = new EventsInfoExample();
        example.setOrderByClause("event_update_time desc" );
        return eventsInfoMapper.selectByExampleWithBLOBs(example);
    }
}
