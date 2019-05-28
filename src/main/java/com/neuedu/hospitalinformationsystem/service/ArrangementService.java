package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.po.Arrangement;
import com.neuedu.hospitalinformationsystem.mapper.ArrangementMapper;

@Service
public class ArrangementService {

    @Resource
    private ArrangementMapper arrangementMapper;


    public int insert(Arrangement record) {
        return arrangementMapper.insert(record);
    }

}

