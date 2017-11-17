package com.ruzz.mywork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruzz.mywork.cof.Mycof;

@Controller
@RequestMapping("/mywork")
public class WebController {
    
    @Autowired
    private Mycof cof;
    
    @ResponseBody
    @RequestMapping(value={"/hello"},method=RequestMethod.GET)
    public String webHelloWork() {
        
        System.out.println(cof.getName());
        System.out.println("hello world!");
        return "hello world";
    }
    
}
