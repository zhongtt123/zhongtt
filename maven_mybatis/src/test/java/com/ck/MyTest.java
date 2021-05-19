package com.ck;

import com.ck.dao.IProductDaoImpl;
import com.ck.entity.Product;
import org.junit.Test;

import java.util.List;

/**
 * @Author 钟婷婷
 * @Date
 */
public class MyTest {
    @Test
    public void test1() {
        IProductDaoImpl dao = new IProductDaoImpl();
        List<Product> list = dao.queryAll();
        System.out.println(list);

    }
}
