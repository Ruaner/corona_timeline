package com.service.impl;

import com.bean.NewsInfo;
import com.mapper.NewsInfoMapper;
import com.service.NewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsInfoServiceImpl implements NewsInfoService {
    @Autowired
    NewsInfoMapper newsInfoMapper;
    @Override
    public List<NewsInfo> getNewsInfo() {
        return newsInfoMapper.selectByExample(null);
    }

    @Override
    public NewsInfo getNewsInfoById(Integer id) {
        return newsInfoMapper.selectByPrimaryKey(id);
    }

}
