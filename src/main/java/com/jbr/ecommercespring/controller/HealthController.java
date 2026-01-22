package com.jbr.ecommercespring.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



// First controller to test that Thymeleaf is working okay
@Controller
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "health";
    }
}