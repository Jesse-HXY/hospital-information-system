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
    public List<Department> getDepartments(@RequestBody Department department) {
        return departmentService.getDepartments(department);
    }

    @RequestMapping("/deleteDepartment")
    public String deleteDepartment(String dId) {
        Boolean result = departmentService.deleteDepartment(dId);
        if (result) {
            return "{\"result\":true}";
        } else {
            return "{\"result\":false}";
        }

    }

    @RequestMapping("/insertDepartment")
    public String insertDepartment(@RequestBody Department department) {
        Boolean result = departmentService.insertDepartment(department);
        if (result) {
            return "{\"result\":true}";
        } else {
            return "{\"result\":false}";
        }
    }
}
