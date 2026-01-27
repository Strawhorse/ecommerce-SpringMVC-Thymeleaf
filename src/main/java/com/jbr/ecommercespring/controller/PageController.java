package com.jbr.ecommercespring.controller;

import com.jbr.ecommercespring.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

//    @GetMapping("/products")
//    public String products() {
//        return "products";
//    }

    // new product controller
    @GetMapping("/products")
    public String products(Model model) {

        List<Product> products = List.of(
                new Product(1L, "Laptop", "Powerful and yet portable", 999.99, "https://via.placeholder.com/300"),
                new Product(1L, "Headphones", "Insert text here", 99.99, "https://via.placeholder.com/300"),
                new Product(1L, "Smartphone", "Insert text here", 299.99, "https://via.placeholder.com/300")
        );

        model.addAttribute("products", products);
        return "products";

    }



}
