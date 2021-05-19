package com.ck.service;

import com.ck.entity.BookInfo;

import java.util.List;
import java.util.Map;

/**
 * @Author 钟婷婷
 * @Date
 */
public interface IBookInfoService {
    public List<BookInfo> queryAllBooks(Map map);
}
