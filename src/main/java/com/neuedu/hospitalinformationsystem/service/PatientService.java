package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.po.Patient;
import com.neuedu.hospitalinformationsystem.mapper.PatientMapper;

@Service
public class PatientService {

    @Resource
    private PatientMapper patientMapper;


    public int insert(Patient record) {
        return patientMapper.insert(record);
    }

}

