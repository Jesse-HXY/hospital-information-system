package com.neuedu.hospitalinformationsystem.service;

import com.neuedu.hospitalinformationsystem.mapper.DepartmentMapper;
import com.neuedu.hospitalinformationsystem.po.Department;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    public List<Department> getDepartments(Department department) {
        List<Department> departments = departmentMapper.getDepartments(department);
        return departments;
    }

    public boolean deleteDepartment(String dId) {
        departmentMapper.deleteDepartment(dId);
        return true;
    }

    public boolean insertDepartment(Department department) {
        departmentMapper.insertDepartment(department);
        return true;
    }
}
