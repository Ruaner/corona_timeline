package com.service;

import com.bean.NewsInfo;

import java.util.List;

public interface NewsInfoService {
    List<NewsInfo> getNewsInfo();

    NewsInfo getNewsInfoById(Integer id);
}
