package com.neuedu.hospitalinformationsystem;

import com.neuedu.hospitalinformationsystem.po.Department;
import com.neuedu.hospitalinformationsystem.po.NonMedicine;
import com.neuedu.hospitalinformationsystem.service.NonMedicineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NonMedicineTest {
    @Resource
    private NonMedicineService nonMedicineService;

    @Test
    public void getNonMedicineTest() {
        NonMedicine nonMedicine = new NonMedicine();
        nonMedicine.setNmCode("JHCSYF(FYQJJ)");
        List<NonMedicine> nonMedicines = nonMedicineService.findBynmIdAndnmName(nonMedicine);
        System.out.println(nonMedicines);
    }

    @Test
    public void deleteNonMedicine() {
        assertEquals(true, nonMedicineService.deleteByPrimaryKey(1));
    }

    @Test
    public void insertNonMedicine() {
        NonMedicine nonMedicine = new NonMedicine();
        nonMedicine.setNmId(20000);
        nonMedicine.setNmName("hhh");
        nonMedicine.setNmCode("hhh");
        assertEquals(true, nonMedicineService.insert(nonMedicine));
    }
}
