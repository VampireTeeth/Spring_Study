package com.steventk.vampireteeth.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("inDataAccessAdvisor")
@Aspect
@Order(1)
public class InDataAccessAdvisor {
    
    @Around("com.steventk.vampireteeth.aspect.SystemArchitecture.inDataAccessLayer()")
    public void aroundDataAccessLayer(ProceedingJoinPoint pjp) {
        System.out.println("Before data access layer");
        try {
            pjp.proceed();
        }catch(Throwable e) {
            System.err.println("Exception caught in data access layer: " + e.getMessage());
        }finally {
            System.out.println("After data access layer");
        }
    }
}
