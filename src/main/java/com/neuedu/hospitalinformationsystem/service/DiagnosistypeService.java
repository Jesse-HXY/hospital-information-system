package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.DiagnosistypeMapper;
import com.neuedu.hospitalinformationsystem.po.Diagnosistype;

@Service
public class DiagnosistypeService {

    @Resource
    private DiagnosistypeMapper diagnosistypeMapper;


    public int insert(Diagnosistype record) {
        return diagnosistypeMapper.insert(record);
    }

}

