package com.company.ecommerce.spring.boot.application.repository;

import com.company.ecommerce.spring.boot.application.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
