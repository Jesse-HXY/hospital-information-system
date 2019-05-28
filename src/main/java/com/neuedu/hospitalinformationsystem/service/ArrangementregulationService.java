package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.ArrangementregulationMapper;
import com.neuedu.hospitalinformationsystem.po.Arrangementregulation;
@Service
public class ArrangementregulationService{

    @Resource
    private ArrangementregulationMapper arrangementregulationMapper;

    
    public int insert(Arrangementregulation record) {
        return arrangementregulationMapper.insert(record);
    }

}
