package com.backend.springBoot;

import com.backend.springBoot.dto.EmployeeDto;
import com.backend.springBoot.dto.global.DataBody;
import com.backend.springBoot.dto.request.EmployeeReqDto;
import com.backend.springBoot.entity.Employee;
import com.backend.springBoot.mapper.EmployeeMapper;
import com.backend.springBoot.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@RequiredArgsConstructor
class ApplicationTests {
	private final EmployeeService employeeService;
	private final EmployeeMapper employeeMapper;
	@Test
	void contextLoads() {
	}


}
