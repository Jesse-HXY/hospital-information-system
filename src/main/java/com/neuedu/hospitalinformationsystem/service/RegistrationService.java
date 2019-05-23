package com.neuedu.hospitalinformationsystem.service;

import com.neuedu.hospitalinformationsystem.mapper.RegistrationMapper;
import com.neuedu.hospitalinformationsystem.po.Registration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RegistrationService {

    @Resource
    private RegistrationMapper registrationMapper;

    public List<Registration> getRegistration(Registration registration){
        List<Registration> registrations = registrationMapper.getRegistrations(registration);
        return registrations;
    }

    public boolean deleteRegistration(int rId){
        registrationMapper.deleteRegistration(rId);
        return true;
    }

    public boolean insertRegistration(Registration registration){
        registrationMapper.insertRegistration(registration);
        return true;
    }

}
