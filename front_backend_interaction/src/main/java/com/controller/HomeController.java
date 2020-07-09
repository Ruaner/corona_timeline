package com.controller;

import com.bean.EventsInfoWithBLOBs;
import com.param.HomeParm;
import com.service.EventsInfoWithBLOBsService;
import com.vo.EventInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *created by huangpan
 *  */
@CrossOrigin
@RestController
public class HomeController {
    private EventsInfoWithBLOBsService eventsInfoWithBLOBsService;

    @Autowired
    public HomeController(EventsInfoWithBLOBsService eventsInfoWithBLOBsService) {
        this.eventsInfoWithBLOBsService = eventsInfoWithBLOBsService;
    }

    @GetMapping("/homepage")
    public Map home(HomeParm homeParm) {
        List<EventsInfoWithBLOBs> listWithBLOBs = eventsInfoWithBLOBsService.getEventsInfoWithBLOBs();
        List<EventInfoVo> vos = listWithBLOBs.stream()
                .map(info -> EventInfoVo.convert(info, null))
                .collect(Collectors.toList());
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("count",listWithBLOBs.size());
        map.put("events",vos);
        return map;
    }
}
