package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.DiagnosisMapper;
import com.neuedu.hospitalinformationsystem.po.Diagnosis;

@Service
public class DiagnosisService {

    @Resource
    private DiagnosisMapper diagnosisMapper;


    public int insert(Diagnosis record) {
        return diagnosisMapper.insert(record);
    }

}

