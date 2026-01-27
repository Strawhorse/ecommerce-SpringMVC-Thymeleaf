package com.jbr.ecommercespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/products")
    public String products() {
        return "products";
    }

}
