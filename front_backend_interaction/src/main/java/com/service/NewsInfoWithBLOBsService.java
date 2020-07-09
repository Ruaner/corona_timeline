package com.service;

import com.bean.NewsInfoWithBLOBs;

import java.util.List;

public interface NewsInfoWithBLOBsService {

    List<NewsInfoWithBLOBs> getNewsInfoWithBLOBsById(Integer id);
}
