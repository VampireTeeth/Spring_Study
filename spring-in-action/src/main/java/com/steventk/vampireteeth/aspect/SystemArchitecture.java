package com.steventk.vampireteeth.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("systemArchitecture")
@Aspect
public class SystemArchitecture {
    
    @Pointcut("within(com.steventk.vampireteeth.web..*)")
    public void inWebLayer() {}
    
    @Pointcut("within(com.steventk.vampireteeth.service..*)")
    public void inServiceLayer() {}
    
    @Pointcut("within(com.steventk.vampireteeth.dao..*)")
    public void inDataAccessLayer() {}
    
    
    @Pointcut("execution(* com.steventk.vampireteeth.service.*.*(..))")
    public void businessService() {}
    
    @Pointcut("execution(* com.steventk.vampireteeth.dao.*.*(..))")
    public void dataAccessOperation() {}
}

