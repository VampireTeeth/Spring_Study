package com.steventk.vampireteeth.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("recordsDao")
@Scope("prototype")
public class RecordsDaoBean implements RecordsDao{

    public void doDataAccess() {
       System.out.println("I am accessing data.");
    }

    public void doFailure() {
        throw new RuntimeException("I am having trouble accessing data.");
    }

}
