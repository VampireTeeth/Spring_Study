package com.steventk.vampireteeth.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("dataAccessAdvisor")
@Aspect
@Order(0)
public class DataAccessAdvisor {

    
    @Before("com.steventk.vampireteeth.aspect.SystemArchitecture.dataAccessOperation()")
    public void doDataAccessCheck(JoinPoint joinpoint) {
        System.out.println("I am doing before data access check.");
    }
    
    @AfterThrowing(value="com.steventk.vampireteeth.aspect." +
    		"SystemArchitecture.dataAccessOperation()",
            throwing="ex")
    public void doFailureRecovery(JoinPoint joinpoint, Exception ex) {
        System.err.println("Exception caught: " + ex.getMessage());
        System.out.println("I am recovering from data access failure.");
    }
    
    @AfterReturning(value="com.steventk.vampireteeth.aspect." +
    		"SystemArchitecture.dataAccessOperation()",
    		returning="retVal")
    public void doDataAccessCheck(JoinPoint joinpoint, Object retVal) {
        System.out.println("I am doing after data access check.");
        
    }
    
    @After(value="com.steventk.vampireteeth.aspect."+
            "SystemArchitecture.dataAccessOperation()")
    public void releaseResource(JoinPoint joinpoint) {
        System.out.println("Resource released");
    }
}
