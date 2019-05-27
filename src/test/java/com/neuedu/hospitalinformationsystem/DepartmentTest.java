package com.neuedu.hospitalinformationsystem;

import com.neuedu.hospitalinformationsystem.po.Department;
import com.neuedu.hospitalinformationsystem.service.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentTest {

    @Resource
    private DepartmentService departmentService;

    @Test
    public void getDepartmentTest() {
        Department department = new Department();
        department.setdId("AZBK");
       // List<Department> departments = departmentService.getDepartments(department);
        List<Department> departments = departmentService.getAllDepartments();
        System.out.println(departments);
    }

    @Test
    public void deleteDepartment() {
        assertEquals(true, departmentService.deleteDepartment("a"));
    }

    @Test
    public void insertDepartment() {
        Department department = new Department();
        department.setdId("df");
        department.setdName("h3h");
        department.setdType("内科");
        department.setdCategory("临床科室");
        assertEquals(true, departmentService.insertDepartment(department));
    }
}
