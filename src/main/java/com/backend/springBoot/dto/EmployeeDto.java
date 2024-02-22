package com.backend.springBoot.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EmployeeDto {
    private int id;
    private String firstName;
    private String lastName;
    private String nrc;
    private String email;
    private String phone;
    private String address;
}
