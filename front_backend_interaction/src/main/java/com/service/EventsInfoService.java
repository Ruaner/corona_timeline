package com.service;

import com.bean.EventsInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EventsInfoService {

  EventsInfo getEventsInfoById(Integer id);
}
