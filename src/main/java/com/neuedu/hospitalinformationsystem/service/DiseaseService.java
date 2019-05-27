package com.neuedu.hospitalinformationsystem.service;

import com.neuedu.hospitalinformationsystem.mapper.DiseaseMapper;
import com.neuedu.hospitalinformationsystem.po.Disease;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiseaseService {

    @Resource
    private DiseaseMapper diseaseMapper;

    public List<String> getDiseaseType() {
        return diseaseMapper.getDiseaseType();
    }
    public List<Disease> getDiseases(Disease disease) {
        List<Disease> diseases = diseaseMapper.getDiseases(disease);
        return diseases;
    }
}
