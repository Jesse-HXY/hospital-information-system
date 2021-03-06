package com.neuedu.hospitalinformationsystem.mapper;

import com.neuedu.hospitalinformationsystem.po.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> getDepartments(Department department);

    List<Department> getAllDepartments();

    void deleteDepartment(String dId);

    void insertDepartment(Department department);

    void updateDepartment(Department department);
}
