package com.ck.dao;

import com.ck.entity.Product;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author 钟婷婷
 * @Date
 */
public interface IProductDao {
    @Select("select * from product")
    @ResultMap("ProductMapper")
    public List<Product> queryAll();
}
