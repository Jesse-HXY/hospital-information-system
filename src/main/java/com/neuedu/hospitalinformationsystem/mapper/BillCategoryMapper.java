package com.neuedu.hospitalinformationsystem.mapper;

import com.neuedu.hospitalinformationsystem.po.BillCategory;


import java.util.List;

public interface BillCategoryMapper {
    void deleteBillCategory(Integer bcId);

    void insertBillCategory(BillCategory billcategory);

    List<BillCategory> selectBillCategory(BillCategory record);


}