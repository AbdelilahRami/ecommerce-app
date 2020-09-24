package com.company.ecommerce.spring.boot.application.repository;

import com.company.ecommerce.spring.boot.application.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
