package com.backend.springBoot.mapper;

import com.backend.springBoot.dto.EmployeeDto;
import com.backend.springBoot.dto.request.EmployeeReqDto;
import com.backend.springBoot.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface EmployeeMapper {
    EmployeeDto mapEntityToDto(Employee employee);
    Employee mapReqToEntity (EmployeeReqDto employeeReqDto);
}
