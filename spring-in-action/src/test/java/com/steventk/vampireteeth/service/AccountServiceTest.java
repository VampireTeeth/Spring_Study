package com.steventk.vampireteeth.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.steventk.vampireteeth.UsageTrack;
import com.steventk.vampireteeth.dao.Account;

public class AccountServiceTest {
    
    @Test
    public void testCreate() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("vampireteeth-context.xml");
        AccountService acctSvc = (AccountService) ctx.getBean("accountService");
        Account acct = new Account("steven", "steven@1022");
        acctSvc.create(acct);
        acctSvc.create(acct);
        acctSvc.create(acct);
        Assert.assertTrue(acctSvc instanceof UsageTrack);
        System.out.println("Usage track:" + ((UsageTrack)acctSvc).getUsage());
    }

}
