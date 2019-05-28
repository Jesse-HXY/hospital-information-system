package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.po.Doctor;
import com.neuedu.hospitalinformationsystem.mapper.DoctorMapper;

@Service
public class DoctorService {

    @Resource
    private DoctorMapper doctorMapper;


    public int insert(Doctor record) {
        return doctorMapper.insert(record);
    }

}

