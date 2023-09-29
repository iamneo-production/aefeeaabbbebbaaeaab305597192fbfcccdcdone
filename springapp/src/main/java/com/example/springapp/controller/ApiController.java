package com.example.springapp.controller;

import com.example.springapp.model.Employee;
import com.example.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    public ApiService apiService;

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        return apiService.getEmployeeById(employeeId);
    }

    
}
