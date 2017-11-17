package com.ruzz.mywork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@Configuration
@ServletComponentScan
public class StartUp
{

        public static void main(String[] args) throws Exception
        { 
            SpringApplication application = new SpringApplication(StartUp.class);
            application.run(args); 
           
        }
}
