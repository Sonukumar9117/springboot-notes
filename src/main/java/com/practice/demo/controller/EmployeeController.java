package com.practice.demo.controller;

import com.practice.demo.dto.EmployeeDto;
import com.practice.demo.entity.Employee;
import com.practice.demo.repo.EmployeeRepo;
import com.practice.demo.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employee")
@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    private final EmployeeRepo employeeRepo;
    @PostMapping()
    public EmployeeDto createEmployee(@Valid @RequestBody EmployeeDto employeeDto){
        return employeeService.createEmployee(employeeDto);
    }

    @GetMapping()
    public Page<Employee> getEmployee(
            @RequestParam(value = "sortBy",defaultValue = "id")String sortBy,
            @RequestParam(value = "order",defaultValue = "ASC")String order,
            @RequestParam(value="page",defaultValue = "0") int page,
            @RequestParam(value="size", defaultValue = "10")int size
    ){
        Pageable pageable= PageRequest.of(
                page,
                size,
                Sort.by( Sort.Direction.valueOf(order.toUpperCase()), sortBy)
        );
         return  employeeRepo.findAll(pageable);
    }

}
