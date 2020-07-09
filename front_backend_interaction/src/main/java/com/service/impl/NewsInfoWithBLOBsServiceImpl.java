package com.service.impl;

import com.bean.NewsInfoExample;
import com.bean.NewsInfoWithBLOBs;
import com.mapper.NewsInfoMapper;
import com.service.NewsInfoWithBLOBsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewsInfoWithBLOBsServiceImpl implements NewsInfoWithBLOBsService {
    @Autowired
    NewsInfoMapper newsInfoMapper;


    @Override
    public List<NewsInfoWithBLOBs> getNewsInfoWithBLOBsById(Integer id) {
        List<NewsInfoWithBLOBs> list = newsInfoMapper.getMediaInfoByEventId(id);

        return list;
    }
}
