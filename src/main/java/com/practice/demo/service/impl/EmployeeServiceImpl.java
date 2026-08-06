package com.practice.demo.service.impl;

import com.practice.demo.dto.EmployeeDto;
import com.practice.demo.entity.Employee;
import com.practice.demo.repo.EmployeeRepo;
import com.practice.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final ModelMapper modelMapper;
    private final EmployeeRepo employeeRepo;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee=modelMapper.map(employeeDto, Employee.class);
//        employee.setActive(true);
        Employee employee1=employeeRepo.save(employee);
        return modelMapper.map(employee1, EmployeeDto.class);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        return null;
    }
}
