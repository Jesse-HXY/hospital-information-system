package com.neuedu.hospitalinformationsystem;

import com.neuedu.hospitalinformationsystem.mapper.DepartmentMapper;
import com.neuedu.hospitalinformationsystem.po.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalInformationSystemApplicationTests {

    @Resource
    private DepartmentMapper departmentMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getDepartmentTest() {
        Department department = new Department();
        department.setdId("a");
        List<Department> departments = departmentMapper.getDepartments(department);
        System.out.println(departments);
    }

}
