package com.backend.springBoot.controller.restApi;

import com.backend.springBoot.dto.EmployeeDto;
import com.backend.springBoot.dto.global.DataBody;
import com.backend.springBoot.dto.request.EmployeeReqDto;
import com.backend.springBoot.entity.Employee;
import com.backend.springBoot.repository.EmployeeRepo;
import com.backend.springBoot.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/employee")
@RequiredArgsConstructor
@CrossOrigin ("*")
public class employeeController {
    private final EmployeeService employeeService;
    private final EmployeeRepo repo;
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
    /*@GetMapping("/detail")
    public ResponseEntity<List<EmployeeDto>> getEmployeeDetail() {
        var employeeDtoList = this.employeeService.getEmployee();
        return new ResponseEntity<>(employeeDtoList, HttpStatus.OK);
    }*/
    @GetMapping("/detail")
    public List<Employee> getEmployeeDetail() {
        return this.repo.findAll();
    }
}
