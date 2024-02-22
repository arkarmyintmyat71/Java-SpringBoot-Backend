package com.backend.springBoot.service;

import com.backend.springBoot.dto.EmployeeDto;
import com.backend.springBoot.dto.global.DataBody;
import com.backend.springBoot.dto.request.EmployeeReqDto;

public interface EmployeeService {
    EmployeeDto getEmployeeById(int id);
    DataBody<EmployeeDto> createEmployee(EmployeeReqDto employeeReqDto);
}
