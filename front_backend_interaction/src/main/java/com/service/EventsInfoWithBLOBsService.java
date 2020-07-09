package com.service;

import com.bean.EventsInfoWithBLOBs;

import java.util.List;

public interface EventsInfoWithBLOBsService {
    EventsInfoWithBLOBs getEventsInfoById(Integer id);

    List<EventsInfoWithBLOBs> getEventsInfoWithBLOBs();
}
