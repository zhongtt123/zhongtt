package com.ck.service.impl;

import com.ck.dao.IProductDao;
import com.ck.entity.Product;
import com.ck.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 钟婷婷
 * @Date
 */
@Service
public class IProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> queryAll(){
        return productDao.queryAll();
    }

}
