package com.steventk.vampireteeth.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.steventk.vampireteeth.dao.Account;


@Service("accountService")
@Scope("prototype")
public class AccountServiceBean implements AccountService{

    public void create(Account account) {
        System.out.println("Creating account ["+account.getUsername()+"]");
    }

}
