package com.neuedu.hospitalinformationsystem.mapper;

import com.neuedu.hospitalinformationsystem.po.Registration;

import java.util.List;

public interface RegistrationMapper {
    List<Registration> getRegistrations(Registration registration);

    void deleteRegistration(int rId);

    void insertRegistration(Registration registration);
}
