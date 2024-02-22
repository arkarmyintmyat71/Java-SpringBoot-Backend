package com.backend.springBoot.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeReqDto {
    private String firstName;
    private String lastName;
    private String nrc;
    private String email;
    private String phone;
    private String address;
}
