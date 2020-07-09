package com.controller;



import com.bean.EventsInfoWithBLOBs;
import com.bean.NewsInfoWithBLOBs;
import com.service.EventsInfoWithBLOBsService;
import com.service.NewsInfoWithBLOBsService;
import com.vo.EventInfoVo;
import com.vo.NewsInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
*created by huangpan
*  */
@CrossOrigin
@RestController
public class EventController {
    private NewsInfoWithBLOBsService newsInfoWithBLOBsService;

    private EventsInfoWithBLOBsService eventsInfoWithBLOBsService;

    @Autowired
    public EventController(NewsInfoWithBLOBsService newsInfoWithBLOBsService, EventsInfoWithBLOBsService eventsInfoWithBLOBsService) {
        this.newsInfoWithBLOBsService = newsInfoWithBLOBsService;
        this.eventsInfoWithBLOBsService = eventsInfoWithBLOBsService;
    }

    @GetMapping("/event")
    public EventInfoVo getEvent(@RequestParam("id") Integer id){
        //查询Event
        EventsInfoWithBLOBs event = eventsInfoWithBLOBsService.getEventsInfoById(id);
        //查询新闻
        List<NewsInfoWithBLOBs> listNewsInfoBLOBs = newsInfoWithBLOBsService.getNewsInfoWithBLOBsById(id);

        //得到新闻信息
        List<NewsInfoVo> newsInfoVos = listNewsInfoBLOBs.stream()
                .map(NewsInfoVo::convert)
                .collect(Collectors.toList());

        //返回事件信息
        return EventInfoVo.convert(event, newsInfoVos);
    }
}
