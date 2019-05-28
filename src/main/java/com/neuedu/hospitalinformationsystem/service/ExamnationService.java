package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.ExamnationMapper;
import com.neuedu.hospitalinformationsystem.po.Examnation;

@Service
public class ExamnationService {

    @Resource
    private ExamnationMapper examnationMapper;


    public int insert(Examnation record) {
        return examnationMapper.insert(record);
    }

}

