package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table
public class MyModel {
    
    @Id
    private Integer categoryCode;
    private Integer categoryValue;
    
}
