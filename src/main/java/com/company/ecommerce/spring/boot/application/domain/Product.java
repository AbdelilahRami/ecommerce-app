package com.company.ecommerce.spring.boot.application.domain;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Builder
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit-price")
    private Float unitPrice;

    @Column(name = "image-url")
    private String imageUrl;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "units-in-stock")
    private Integer availableUnistInStock;

    @Column(name = "productCreateDate")
    @CreationTimestamp
    private LocalDateTime productCreateDate;

    @Column(name = "productUpdateDate")
    @UpdateTimestamp
    private LocalDateTime productUpdateDate;

    @Column(name = "productCategory")
    @ManyToOne
    @JoinColumn(name="category-id", nullable = false)
    private ProductCategory productCategory;
}
