package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.MedicineMapper;
import com.neuedu.hospitalinformationsystem.po.Medicine;

@Service
public class MedicineService {

    @Resource
    private MedicineMapper medicineMapper;


    public int insert(Medicine record) {
        return medicineMapper.insert(record);
    }

}

