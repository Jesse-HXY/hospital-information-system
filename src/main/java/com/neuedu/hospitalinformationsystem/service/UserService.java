package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.UserMapper;
import com.neuedu.hospitalinformationsystem.po.User;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public int insert(User record) {
        return userMapper.insert(record);
    }

}

