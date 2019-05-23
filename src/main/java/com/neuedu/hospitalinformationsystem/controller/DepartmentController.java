package com.neuedu.hospitalinformationsystem.controller;

import com.neuedu.hospitalinformationsystem.po.Department;
import com.neuedu.hospitalinformationsystem.service.DepartmentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    @RequestMapping("/getDepartments")
    public List<Department> getDepartments(@RequestBody Department department){
        return departmentService.getDepartments(department);
    }

    @RequestMapping("/deleteDepartment")
    public String deleteDepartment(String dId){
        departmentService.deleteDepartment(dId);
        return "{\"result\":true}";
    }

    @RequestMapping("/insertDepartment")
    public String insertDepartment(@RequestBody Department department){
        departmentService.insertDepartment(department);
        return "{\"result\":true}";
    }
}
