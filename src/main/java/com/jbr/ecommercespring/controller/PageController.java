package com.jbr.ecommercespring.controller;

import com.jbr.ecommercespring.model.Product;
import com.jbr.ecommercespring.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;


@Controller
public class PageController {


//    Instantiate the product repository interface
    private final ProductRepository productRepository;


//    Now add its constructor
    public PageController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }



    // new product controller
    @GetMapping("/products")
    public String products(Model model) {


//        Reaches into the model for the database and uses interface to return elements
        model.addAttribute("products", productRepository.findAll());
        return "products";

    }



//    mapping for each individual product
    @GetMapping("/products/{id}")
    public String productDetail(@PathVariable Long id, Model model) {

        Optional<Product> product = productRepository.findById(id);

        if (product.isPresent()) {
            model.addAttribute("product", product.get());
            return "product-detail";
        } else {
            return "redirect:/products";
        }
    }



}



//
//List<Product> products = List.of(
//        new Product("1L", "Laptop", new BigDecimal("999.99"), "https://via.placeholder.com/300"),
//        new Product("1L", "Headphones", new BigDecimal("99.99"), "https://via.placeholder.com/300"),
//        new Product("1L", "Smartphone",new BigDecimal("299.99"), "https://via.placeholder.com/300")
//);
//
//        model.addAttribute("products", products);
