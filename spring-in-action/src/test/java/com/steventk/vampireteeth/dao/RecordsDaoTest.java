package com.steventk.vampireteeth.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RecordsDaoTest {

    @Test
    public void testDoDataAccess() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("vampireteeth-context.xml");
        RecordsDao recordsDao = (RecordsDao) ctx.getBean("recordsDao");
        recordsDao.doDataAccess();
        recordsDao.doFailure();
    }
}
