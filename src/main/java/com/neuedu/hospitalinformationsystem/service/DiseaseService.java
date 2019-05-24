package com.neuedu.hospitalinformationsystem.service;

import com.neuedu.hospitalinformationsystem.mapper.DiseaseMapper;
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
}
