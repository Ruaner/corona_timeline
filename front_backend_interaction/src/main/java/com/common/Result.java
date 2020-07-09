package com.common;

import com.bean.NewsInfoWithBLOBs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private int isfirst;//是否还能往上滚动
    private int islast;//是否还能往下滚动
    private int count;//返回的事件个数
    private List<NewsInfoWithBLOBs> list;

    }
