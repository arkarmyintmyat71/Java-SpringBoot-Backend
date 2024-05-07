package com.backend.springBoot.service;

import com.backend.springBoot.dto.EmployeeDto;
import com.backend.springBoot.dto.global.DataBody;
import com.backend.springBoot.dto.request.EmployeeReqDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto getEmployeeById(int id);
    DataBody<EmployeeDto> createEmployee(EmployeeReqDto employeeReqDto);
    List<EmployeeDto> getEmployee();
}
