package com.example.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class ProduceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produceTypeId;

    @NotEmpty(message = "Không được để trống")
    private String produceTypeName;

    public ProduceType() {
    }

    public ProduceType(Long produceTypeId, String produceTypeName) {
        this.produceTypeId = produceTypeId;
        this.produceTypeName = produceTypeName;
    }

    public Long getProduceTypeId() {
        return produceTypeId;
    }

    public void setProduceTypeId(Long produceTypeId) {
        this.produceTypeId = produceTypeId;
    }

    public String getProduceTypeName() {
        return produceTypeName;
    }

    public void setProduceTypeName(String produceTypeName) {
        this.produceTypeName = produceTypeName;
    }
}
