package com.neuedu.hospitalinformationsystem;

import com.neuedu.hospitalinformationsystem.po.BillCategory;
import com.neuedu.hospitalinformationsystem.po.Department;
import com.neuedu.hospitalinformationsystem.service.BillCategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BillCategoryTest {

    @Resource
    private BillCategoryService billCategoryService;

    @Test
    public void getBillCategorys() {
        BillCategory billCategory = new BillCategory();
        billCategory.setBcid(1);
        List<BillCategory> billCategoryList = billCategoryService.selectBillCategory(billCategory);
        System.out.println(billCategoryList);
    }

    @Test
    public void deleteBillCategory() {
        assertEquals(true, billCategoryService.deleteBillCategory(4));
    }

    @Test
    public void insertBillCategory() {
        BillCategory billCategory = new BillCategory();
        billCategory.setBcid(4);
        billCategory.setBcname("hhh");
        assertEquals(true, billCategoryService.insertBillCategory(billCategory));
    }
}
