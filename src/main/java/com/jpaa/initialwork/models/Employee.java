package com.jpaa.initialwork.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            name="Employee_Id",
            unique = true,
            nullable = false
    )
    private String identifier;

    @Column(
            nullable = false
    )
    private String firstname;

    @Column(
            nullable = false
    )
    private String lastname;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;


    @Column(
            nullable = false
    )
    @Enumerated(EnumType.STRING)
    private EmployeeRole role;


    @Column(
            nullable = false
    )
    private LocalDate birthdate;

}
