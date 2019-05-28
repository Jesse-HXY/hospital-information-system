package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.InvoceMapper;
import com.neuedu.hospitalinformationsystem.po.Invoce;

@Service
public class InvoceService {

    @Resource
    private InvoceMapper invoceMapper;


    public int insert(Invoce record) {
        return invoceMapper.insert(record);
    }

}

