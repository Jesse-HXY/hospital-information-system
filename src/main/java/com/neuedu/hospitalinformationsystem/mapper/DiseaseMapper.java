package com.neuedu.hospitalinformationsystem.mapper;

import com.neuedu.hospitalinformationsystem.po.Disease;

import java.util.List;

public interface DiseaseMapper {
    List<String> getDiseaseType();

    List<Disease> getDiseases(Disease disease);
}