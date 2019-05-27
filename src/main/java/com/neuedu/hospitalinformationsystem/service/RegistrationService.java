package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.po.Registration;
import com.neuedu.hospitalinformationsystem.mapper.RegistrationMapper;

@Service
public class RegistrationService {

    @Resource
    private RegistrationMapper registrationMapper;


    public int insert(Registration record) {
        return registrationMapper.insert(record);
    }

}

