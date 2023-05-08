package com.example.examm4l2.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;

    private Integer productPrice;

    private String productStatus;

    @ManyToOne
    @JoinColumn(name = "product_type_id", nullable = false, referencedColumnName = "productTypeId")
    private ProductType productType;

    public Product() {
    }

    public Product(Long productId, String productName, Integer productPrice, String productStatus, ProductType productType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
        this.productType = productType;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
