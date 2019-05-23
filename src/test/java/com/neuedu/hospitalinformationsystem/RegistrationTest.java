package com.neuedu.hospitalinformationsystem;

import com.neuedu.hospitalinformationsystem.po.Registration;
import com.neuedu.hospitalinformationsystem.service.RegistrationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegistrationTest {
    @Resource
    public RegistrationService registrationService;

    @Test
    public void getDepartmentTest() {
        Registration registration = new Registration();
        registration.setrId(1);
        List<Registration> registrations = registrationService.getRegistration(registration);
        System.out.println(registrations);
    }
}
