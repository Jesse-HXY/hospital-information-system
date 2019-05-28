package com.neuedu.hospitalinformationsystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neuedu.hospitalinformationsystem.mapper.AccountMapper;
import com.neuedu.hospitalinformationsystem.po.Account;
@Service
public class AccountService{

    @Resource
    private AccountMapper accountMapper;

    
    public void insert(Account record) {

    }

}
