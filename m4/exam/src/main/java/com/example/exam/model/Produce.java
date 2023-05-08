package com.example.exam.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Produce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produceId;

    @NotNull(message = "Không được để trống")
    @Size(min = 5, max = 50, message = "Kí tự từ 5 --> 50")
    private String produceName;

    @NotNull(message = "Không được để trống")
    @Range(min = 200, message = "Lớn hơn 200")
    private Integer producePrice;


    private String produceStatic;

    @NotNull(message = "Không được để trống")
    @ManyToOne
    @JoinColumn(name = "produce_type_id", nullable = false,referencedColumnName = "produceTypeId")
    private ProduceType produceType;

    public Produce() {
    }

    public Produce(Long produceId, String produceName, Integer producePrice, String produceStatic, ProduceType produceType) {
        this.produceId = produceId;
        this.produceName = produceName;
        this.producePrice = producePrice;
        this.produceStatic = produceStatic;
        this.produceType = produceType;
    }

    public Long getProduceId() {
        return produceId;
    }

    public void setProduceId(Long produceId) {
        this.produceId = produceId;
    }

    public String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }

    public Integer getProducePrice() {
        return producePrice;
    }

    public void setProducePrice(Integer producePrice) {
        this.producePrice = producePrice;
    }

    public String getProduceStatic() {
        return produceStatic;
    }

    public void setProduceStatic(String produceStatic) {
        this.produceStatic = produceStatic;
    }

    public ProduceType getProduceType() {
        return produceType;
    }

    public void setProduceType(ProduceType produceType) {
        this.produceType = produceType;
    }
}
