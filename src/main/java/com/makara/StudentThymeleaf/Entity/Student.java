package com.makara.StudentThymeleaf.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    @Column(name="name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    public Student(String name, String address, String email) {
        super();
        this.name = name;
        this.address = address;
        this.email = email;
    }
}
