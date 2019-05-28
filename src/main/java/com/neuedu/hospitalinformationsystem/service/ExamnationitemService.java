package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.po.Examnationitem;
import com.neuedu.hospitalinformationsystem.mapper.ExamnationitemMapper;

@Service
public class ExamnationitemService {

    @Resource
    private ExamnationitemMapper examnationitemMapper;


    public int insert(Examnationitem record) {
        return examnationitemMapper.insert(record);
    }

}

