package com.vo;

import com.bean.NewsInfoWithBLOBs;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class NewsInfoVo implements Serializable {
    private Integer media_id;
    private String url;
    private Integer attitude;
    private Float score;
    private String title;

    public static NewsInfoVo convert(NewsInfoWithBLOBs newsInfo) {
        NewsInfoVo vo = new NewsInfoVo();

        vo.setMedia_id(newsInfo.getNewsMediaId());
        vo.setUrl(newsInfo.getNewsUrl());
        vo.setAttitude(newsInfo.getNewsAttitude());
        vo.setScore(newsInfo.getNewsAttiScore());
        vo.setTitle(newsInfo.getNewsTitle());

        return vo;
    }
}
