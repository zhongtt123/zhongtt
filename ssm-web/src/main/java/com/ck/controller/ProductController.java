package com.ck.controller;

import com.ck.entity.Product;
import com.ck.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author 钟婷婷
 * @Date
 */
@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("queryAll")
    @ResponseBody
    public List<Product>  queryAll(){
        return productService.queryAll();
    }
}
