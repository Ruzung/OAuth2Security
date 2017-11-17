package com.ruzz.mywork.task.copy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class ApplicationInit implements ApplicationRunner, Ordered{

    @Override
    public void run(ApplicationArguments args) throws Exception {
       System.out.println("ApplicationInit------执行");
        
    }

    @Override
    public int getOrder() {
        return 0;
    }

}
