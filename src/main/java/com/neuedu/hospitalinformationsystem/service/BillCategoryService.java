package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.neuedu.hospitalinformationsystem.mapper.BillCategoryMapper;
import com.neuedu.hospitalinformationsystem.po.BillCategory;

import java.util.List;

@Service
public class BillCategoryService {

    @Resource
    private BillCategoryMapper billCategoryMapper;


    public boolean insertBillCategory(BillCategory billCategory) {
        billCategoryMapper.insertBillCategory(billCategory);
        return true;
    }

    public List<BillCategory> selectBillCategory(BillCategory billCategory) {
        return billCategoryMapper.selectBillCategory(billCategory);
    }


    public boolean deleteBillCategory(Integer bcId) {
        billCategoryMapper.deleteBillCategory(bcId);
        return true;
    }

}
