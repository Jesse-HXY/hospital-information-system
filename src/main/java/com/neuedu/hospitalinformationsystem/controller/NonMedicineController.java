package com.neuedu.hospitalinformationsystem.controller;


import com.neuedu.hospitalinformationsystem.po.NonMedicine;
import com.neuedu.hospitalinformationsystem.service.NonMedicineService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/NonMedicine")
public class NonMedicineController {

    @Resource
    private NonMedicineService nonMedicineService;

    @RequestMapping("/getNonMedicine")
    public List<NonMedicine> getNonMedicine(@RequestBody NonMedicine nonMedicine) {
        return nonMedicineService.findBynmIdAndnmName(nonMedicine);
    }

    @RequestMapping("/deleteNonMedicine")
    public String deleteNonMedicine(Integer nmId) {
        Boolean result = nonMedicineService.deleteByPrimaryKey(nmId);
        if (result) {
            return "{\"result\":true}";
        } else {
            return "{\"result\":false}";
        }

    }

    @RequestMapping("/insertNonMedicine")
    public String insertNonMedicine(@RequestBody NonMedicine nonMedicine) {
        Boolean result = nonMedicineService.insert(nonMedicine);
        if (result) {
            return "{\"result\":true}";
        } else {
            return "{\"result\":false}";
        }
    }
}
