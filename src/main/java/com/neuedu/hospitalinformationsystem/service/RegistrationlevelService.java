package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.RegistrationlevelMapper;
import com.neuedu.hospitalinformationsystem.po.Registrationlevel;

@Service
public class RegistrationlevelService {

    @Resource
    private RegistrationlevelMapper registrationlevelMapper;


    public int insert(Registrationlevel record) {
        return registrationlevelMapper.insert(record);
    }

}

