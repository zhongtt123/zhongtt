package com.ck.dao;

import com.ck.entity.Product;
import com.ck.util.MybatisUtil;
import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.ir.ReturnNode;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author 钟婷婷
 * @Date
 */
public class IProductDaoImpl {
    public List<Product> queryAll(){
        SqlSession session = MybatisUtil.openSession(false);
        IProductDao productDao = session.getMapper(IProductDao.class);
        return productDao.queryAll();
    }

}
