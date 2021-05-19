package com.ck.dao;

import com.ck.entity.BookType;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

/**
 * @Author 钟婷婷
 * @Date
 */
public interface BookTypeDao {

    @Select("Select * from booktype where btid=${0}")
    @ResultMap("BookTypeMapper")
    public BookType queryByid(int btid);
}
