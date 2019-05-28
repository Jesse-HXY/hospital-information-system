package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.po.Diagnosistemplate;
import com.neuedu.hospitalinformationsystem.mapper.DiagnosistemplateMapper;

@Service
public class DiagnosistemplateService {

    @Resource
    private DiagnosistemplateMapper diagnosistemplateMapper;


    public int insert(Diagnosistemplate record) {
        return diagnosistemplateMapper.insert(record);
    }

}

