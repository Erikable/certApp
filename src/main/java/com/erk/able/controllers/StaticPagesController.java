package com.erk.able.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticPagesController {
    @GetMapping("/page1")
    public String pageOne(){
        return "/statics/page_one";
    }

}
