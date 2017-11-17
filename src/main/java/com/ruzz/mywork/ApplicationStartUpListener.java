package com.ruzz.mywork;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationStartUpListener implements ApplicationListener<ApplicationStartedEvent>{

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("onApplicationEvent------执行");
        
    }

}
