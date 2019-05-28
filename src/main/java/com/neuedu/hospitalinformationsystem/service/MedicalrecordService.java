package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.po.Medicalrecord;
import com.neuedu.hospitalinformationsystem.mapper.MedicalrecordMapper;

@Service
public class MedicalrecordService {

    @Resource
    private MedicalrecordMapper medicalrecordMapper;


    public int insert(Medicalrecord record) {
        return medicalrecordMapper.insert(record);
    }

}

