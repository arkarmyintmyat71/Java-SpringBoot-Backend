package com.backend.springBoot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_detail")
public class Employee {
    @Id
    @Column(name = "id", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name", length = 30)
    private String firstName;
    @Column(name = "last_name", length = 30)
    private String lastName;
    @Column(name = "nrc", length = 20)
    private String nrc;
    @Column(name = "email", columnDefinition = "VARCHAR(30) DEFAULT ''")
    private String email;
    @Column(name = "phone", columnDefinition = "VARCHAR(30) DEFAULT ''")
    private String phone;
    @Column(name = "address", columnDefinition = "VARCHAR(30) DEFAULT ''")
    private String address;
}
