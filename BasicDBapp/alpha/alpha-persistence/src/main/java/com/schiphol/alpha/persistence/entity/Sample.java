package com.schiphol.alpha.persistence.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Sample {
    @GeneratedValue
    @Id
    private Long id;
    private String exampleProperty;
}
