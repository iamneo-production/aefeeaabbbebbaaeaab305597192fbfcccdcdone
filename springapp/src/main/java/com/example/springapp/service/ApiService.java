package com.example.springapp.service;

import com.example.springapp.model.Employee;
import com.example.springapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
   
    @Autowired
   public EmployeeRepo employeeRepo;

    public Employee getEmployeeById(int employeeId) {
        return employeeRepo.findById(employeeId).orElse(null);
    }
   
}
