package com.example.examm4l3.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Build {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long buildId;


    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;


    private Integer quanlity;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false,referencedColumnName = "productId")
    private Product product;

    public Build() {
    }

    public Build(Long buildId, Date date, Integer quanlity, Product product) {
        this.buildId = buildId;
        this.date = date;
        this.quanlity = quanlity;
        this.product = product;
    }

    public Long getBuildId() {
        return buildId;
    }

    public void setBuildId(Long buildId) {
        this.buildId = buildId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(Integer quanlity) {
        this.quanlity = quanlity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
