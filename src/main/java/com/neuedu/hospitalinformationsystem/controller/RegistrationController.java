package com.neuedu.hospitalinformationsystem.controller;

import com.neuedu.hospitalinformationsystem.po.Registration;
import com.neuedu.hospitalinformationsystem.service.RegistrationService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
    @Resource
    private RegistrationService registrationService;

    @RequestMapping("/getRegistration")
    public List<Registration> getRegistration(@RequestBody Registration registration) {
        return registrationService.getRegistration(registration);
    }

    @RequestMapping("/deleteRegistration")
    public String deleteRegistration(int rId) {
        Boolean result = registrationService.deleteRegistration(rId);
        if (result) {
            return "{\"result\":true}";
        } else {
            return "{\"result\":false}";
        }
    }

    @RequestMapping("/insertRegistration")
    public String insertRegistration(@RequestBody Registration registration) {
        Boolean result = registrationService.insertRegistration(registration);
        if (result) {
            return "{\"result\":true}";
        } else {
            return "{\"result\":false}";
        }
    }


}
