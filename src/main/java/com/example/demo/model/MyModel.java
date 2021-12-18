package com.example.demo.model;

import lombok.Data;

import javax.persistence.Id;

@Data
public class MyModel {
    
    @Id
    private Integer categoryCode;
    private Integer categoryValue;
    
}
