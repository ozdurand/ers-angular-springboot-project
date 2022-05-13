package com.datajabs.ersproject.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "employee")
//@Data
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Email(message = "Email should be valid")
    @Column(name = "username", unique = true)
    private String username;


    @Column(name = "password")
    private String password;


    @Column(name = "firstname")
    private String firstname;


    @Column(name = "lastname")
    private String lastname;


    @Column(name = "isManager")
    private Boolean isManager;

    @OneToMany(mappedBy = "employee")
    private List<Reimbursement> reimbursements;





}
