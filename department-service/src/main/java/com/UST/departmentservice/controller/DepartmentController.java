package com.UST.departmentservice.controller;

import com.UST.departmentservice.entity.Department;
import com.UST.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService service;
    @PostMapping("/")
    public Department saveDepartmentById(@RequestBody Department department){
        return service.saveDepartmentById(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id")Long departmentId){
        return service.findDepartmentById(departmentId);
    }


}
