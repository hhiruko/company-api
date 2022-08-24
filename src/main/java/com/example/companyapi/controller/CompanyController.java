package com.example.companyapi.controller;

import com.example.companyapi.feign.EmployeeFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    EmployeeFeign employeeFeign;

    @GetMapping("/check")
    public String check(){
        return "company-api is working";
    }

    @GetMapping("/employee/check")
    public String checkEmployee(){
        return employeeFeign.checkEmployee();
    }
}
