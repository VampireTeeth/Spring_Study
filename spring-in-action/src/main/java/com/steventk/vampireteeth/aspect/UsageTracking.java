package com.steventk.vampireteeth.aspect;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.steventk.vampireteeth.UsageTrack;
import com.steventk.vampireteeth.UsageTrackBean;

@Component("usageTracking")
@Aspect
public class UsageTracking {
    
    @DeclareParents(value="com.steventk.vampireteeth.service.*", 
            defaultImpl=UsageTrackBean.class)
    @Resource(name="usageTrack")
    private UsageTrack mixin;  
    
    @Before("com.steventk.vampireteeth.aspect.SystemArchitecture.businessService()")
    public void usageTrack(JoinPoint joinpoint) {
        mixin.incrementUsage();
    }
    

}
