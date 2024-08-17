package com.aral.springstudents.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private LocalDate dateBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public int getAge(){
        return Period.between(dateBirth, LocalDate.now()).getYears();
    }
}
