package com.ck.dao;

import com.ck.entity.BookInfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author 钟婷婷
 * @Date
 */
public interface BookInfoDao {;
    @Select("select * from bookinfo")
    @ResultMap("BookInfoMapper")
    public List<BookInfo> queryAllBooks();
}
