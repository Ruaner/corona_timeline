package com.vo;

import com.bean.EventsInfoWithBLOBs;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class EventInfoVo implements Serializable {
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+08")
    private Date time;
    private String title;
    private String disc;
    private String country;
    private Integer type;
    private Integer id;
    private List<NewsInfoVo> media;

    public static EventInfoVo convert(EventsInfoWithBLOBs eventInfo, List<NewsInfoVo> newsInfoVos) {
        EventInfoVo vo = new EventInfoVo();

        vo.setTime(eventInfo.getEventUpdateTime());
        vo.setTitle(eventInfo.getEventTitle());
        vo.setDisc(eventInfo.getEventDis());
        vo.setCountry(eventInfo.getEventCountry());
        vo.setType(eventInfo.getEventCate());
        vo.setId(eventInfo.getEventId());
        vo.setMedia(newsInfoVos);

        return vo;
    }
}
