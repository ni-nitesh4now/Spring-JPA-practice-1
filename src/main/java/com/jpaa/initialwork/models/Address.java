package com.jpaa.initialwork.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.PrimitiveIterator;

@Setter
@Getter
@Entity
public class Address {

    @Id
    @GeneratedValue
    private  Integer id;

    private String streetName;

    private String houseNumber;

    @Column(
            nullable = false
    )
    private String zipCode;

    @OneToOne
    @JoinColumn(name="employee_id")
    private Employee employee;


}
