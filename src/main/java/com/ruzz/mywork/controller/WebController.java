package com.ruzz.mywork.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    
    @ResponseBody
    @RequestMapping(value={"/users"},method=RequestMethod.GET)
    public String webHelloWork() {
        
    	//Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "product id : 1";
    }
    
}
