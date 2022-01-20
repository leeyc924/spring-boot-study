package com.example.spring_boot_crud.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "userName")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "firstName")
    private boolean firstName;

    @Column(name = "lastName")
    private boolean lastName;

    @Column(name = "age")
    private boolean age;

    @Column(name = "salary")
    private boolean salary;
}
