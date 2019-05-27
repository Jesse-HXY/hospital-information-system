package com.neuedu.hospitalinformationsystem.controller;

import com.neuedu.hospitalinformationsystem.po.Department;
import com.neuedu.hospitalinformationsystem.service.DepartmentService;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/getAllDepartments")
    public List<Department> getAllDepartments() {
        return  departmentService.getAllDepartments();
    }

    @RequestMapping("/deleteDepartment")
    public String deleteDepartment(@RequestBody JSONObject dId) {
        Boolean result = departmentService.deleteDepartment(dId.getString("dId"));
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
