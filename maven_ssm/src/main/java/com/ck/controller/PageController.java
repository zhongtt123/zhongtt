package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 钟婷婷
 * @Date
 */
@Controller
public class PageController {
    @RequestMapping("page")
    public String page(String page){
        return page;
    }
}
