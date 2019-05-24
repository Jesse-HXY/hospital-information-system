package com.neuedu.hospitalinformationsystem.controller;


import com.neuedu.hospitalinformationsystem.po.BillCategory;
import com.neuedu.hospitalinformationsystem.service.BillCategoryService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/BillCategory")
public class BillCategoryController {

    @Resource
    private BillCategoryService billCategoryService;

    @RequestMapping("/getBillCategorys")
    public List<BillCategory> getBillCategorys(@RequestBody BillCategory BillCategory) {
        return billCategoryService.selectBillCategory(BillCategory);
    }

    @RequestMapping("/deleteBillCategory")
    public String deleteBillCategory(Integer bcId) {
        Boolean result = billCategoryService.deleteBillCategory(bcId);
        if (result) {
            return "{\"result\":true}";
        } else {
            return "{\"result\":false}";
        }

    }

    @RequestMapping("/insertBillCategory")
    public String insertBillCategory(@RequestBody BillCategory billCategory) {
        Boolean result = billCategoryService.insertBillCategory(billCategory);
        if (result) {
            return "{\"result\":true}";
        } else {
            return "{\"result\":false}";
        }
    }
}
