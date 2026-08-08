package com.practice.demo;

import com.practice.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@RequiredArgsConstructor
@SpringBootTest
class DemoApplicationTests {
    private final EmployeeService employeeService;
	@Test
	void contextLoads() {
	}


}
