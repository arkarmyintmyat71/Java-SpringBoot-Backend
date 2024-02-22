package com.backend.springBoot.controller.restApi;

import com.backend.springBoot.controller.EmployeeController;
import com.backend.springBoot.dto.EmployeeDto;
import com.backend.springBoot.dto.global.DataBody;
import com.backend.springBoot.dto.request.EmployeeReqDto;
import com.backend.springBoot.service.EmployeeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Employee Detail")
@RequestMapping(value = "/api/v1/employee")
@RequiredArgsConstructor
public class employeeApi implements EmployeeController {
    private final EmployeeService employeeService;
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable int id) {
       EmployeeDto employeeDto = this.employeeService.getEmployeeById(id);
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<DataBody<EmployeeDto>> createEmployee(@RequestBody EmployeeReqDto employeeReqDto) {
        DataBody<EmployeeDto> employeeDto = this.employeeService.createEmployee(employeeReqDto);
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }
}
