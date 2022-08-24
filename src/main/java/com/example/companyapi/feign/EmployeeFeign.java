package com.example.companyapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("employee-core-api")
public interface EmployeeFeign {

    @GetMapping("/employee/check")
    String checkEmployee();
}
