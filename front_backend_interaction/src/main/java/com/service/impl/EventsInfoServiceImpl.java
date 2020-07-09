package com.service.impl;

import com.bean.EventsInfo;
import com.mapper.EventsInfoMapper;
import com.service.EventsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EventsInfoServiceImpl implements EventsInfoService {

    @Autowired
    EventsInfoMapper eventsInfoMapper;

    @Override
    public EventsInfo getEventsInfoById(Integer id) {
        return eventsInfoMapper.selectByPrimaryKey(id);
    }
}
