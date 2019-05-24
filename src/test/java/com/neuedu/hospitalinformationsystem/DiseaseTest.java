package com.neuedu.hospitalinformationsystem;

import com.neuedu.hospitalinformationsystem.mapper.DiseaseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiseaseTest {

    @Resource
    private DiseaseMapper diseaseMapper;

    @Test
    public void getDiseaseType(){
        List<String> diseaseType = diseaseMapper.getDiseaseType();
        System.out.println(diseaseType);
    }
}
