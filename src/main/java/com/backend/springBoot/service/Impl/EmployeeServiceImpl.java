package com.backend.springBoot.service.Impl;

import com.backend.springBoot.constant.ErrorMsg;
import com.backend.springBoot.dto.EmployeeDto;
import com.backend.springBoot.dto.global.DataBody;
import com.backend.springBoot.dto.request.EmployeeReqDto;
import com.backend.springBoot.entity.Employee;
import com.backend.springBoot.exception.ResourceNotFoundException;
import com.backend.springBoot.mapper.EmployeeMapper;
import com.backend.springBoot.repository.EmployeeRepo;
import com.backend.springBoot.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;
    private final EmployeeMapper employeeMapper;
    @Override
    public EmployeeDto getEmployeeById(int id) {
        Employee employee = this.employeeRepo.findById(id).orElseThrow(() -> {
            throw new ResourceNotFoundException(ErrorMsg.ID_NOT_FOUND);
        });
        EmployeeDto employeeDto = this.employeeMapper.mapEntityToDto(employee);

        return  employeeDto;
    }
    @Override
    public DataBody<EmployeeDto> createEmployee(EmployeeReqDto employeeReqDto) {
        var employee = this.employeeMapper.mapReqToEntity(employeeReqDto);
        this.employeeRepo.save(employee);
        EmployeeDto employeeDto = this.employeeMapper.mapEntityToDto(employee);
        return new DataBody<>(employeeDto);
    }
}
