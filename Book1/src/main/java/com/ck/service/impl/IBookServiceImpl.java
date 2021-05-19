package com.ck.service.impl;

import com.ck.dao.BookInfoDao;
import com.ck.dao.BookTypeDao;
import com.ck.entity.BookInfo;
import com.ck.entity.BookType;
import com.ck.service.IBookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author 钟婷婷
 * @Date
 */
@Service
public class IBookServiceImpl implements IBookInfoService {
     @Autowired
     private BookInfoDao bookInfoDao;
     @Autowired
     private BookTypeDao bookTypeDao;
     @Override
     public List<BookInfo> queryAllBooks(Map map){
         return bookInfoDao.queryAllBooks();
     }
     public BookType queryByid(int btid){
         return bookTypeDao.queryByid(btid);
     }
}
