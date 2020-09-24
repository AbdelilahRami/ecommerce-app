package com.company.ecommerce.spring.boot.application.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product-category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column("category-name")
    private String categoryName;

    private Set<Product> products;
}
