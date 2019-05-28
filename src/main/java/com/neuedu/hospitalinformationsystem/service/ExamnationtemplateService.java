package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.ExamnationtemplateMapper;
import com.neuedu.hospitalinformationsystem.po.Examnationtemplate;

@Service
public class ExamnationtemplateService {

    @Resource
    private ExamnationtemplateMapper examnationtemplateMapper;


    public int insert(Examnationtemplate record) {
        return examnationtemplateMapper.insert(record);
    }

}

