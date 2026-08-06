package com.practice.demo.service;

import com.practice.demo.dto.EmployeeDto;

public interface EmployeeService {
     EmployeeDto createEmployee(EmployeeDto employeeDto);
     EmployeeDto getEmployeeById(Long id);
}
