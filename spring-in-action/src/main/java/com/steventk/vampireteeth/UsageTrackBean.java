package com.steventk.vampireteeth;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("usageTrack")
@Scope("prototype")
public class UsageTrackBean implements UsageTrack{

    private int count;
    
    public void incrementUsage() {
        count++;
    }

    public int getUsage() {
        return count;
    }

}
