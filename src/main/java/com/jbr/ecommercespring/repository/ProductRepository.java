package com.jbr.ecommercespring.repository;

import com.jbr.ecommercespring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // implements Jpa interface and methods

}
