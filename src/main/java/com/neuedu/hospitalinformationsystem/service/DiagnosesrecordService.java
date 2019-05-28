package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.po.Diagnosesrecord;
import com.neuedu.hospitalinformationsystem.mapper.DiagnosesrecordMapper;

@Service
public class DiagnosesrecordService {

    @Resource
    private DiagnosesrecordMapper diagnosesrecordMapper;


    public int insert(Diagnosesrecord record) {
        return diagnosesrecordMapper.insert(record);
    }

}


