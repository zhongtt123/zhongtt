package com.ck.controller;

import com.ck.entity.Product;
import com.ck.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String queryAll(ModelMap map){
        List<Product> products = productService.queryAll();
        System.out.println(products);
        map.put("ProductList", products);
        return "product";
    }
}
