package com.neuedu.hospitalinformationsystem.controller;

import com.neuedu.hospitalinformationsystem.po.Disease;
import com.neuedu.hospitalinformationsystem.service.DiseaseService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/disease")
public class DiseaseController {

    @Resource
    private DiseaseService diseaseService;

    @RequestMapping("/getDiseases")
    public List<Disease> getDiseases(@RequestBody Disease disease) {
        return diseaseService.getDiseases(disease);
    }
}
