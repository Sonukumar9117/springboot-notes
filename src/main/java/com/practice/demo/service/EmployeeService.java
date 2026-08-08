package com.practice.demo.service;

import com.practice.demo.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
     EmployeeDto createEmployee(EmployeeDto employeeDto);
     EmployeeDto getEmployeeById(Long id);

     List<EmployeeDto> geAll();

}
