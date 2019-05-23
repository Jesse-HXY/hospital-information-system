package com.neuedu.hospitalinformationsystem.mapper;

import com.neuedu.hospitalinformationsystem.po.NonMedicine;

import java.util.List;

public interface NonmedicineMapper {
    void deleteByPrimaryKey(Integer nmId);

    void insert(NonMedicine record);

    List<NonMedicine> findBynmIdAndnmName(NonMedicine nonMedicine);


}