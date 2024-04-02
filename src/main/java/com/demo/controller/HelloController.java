package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/welcome")
    public String getMessage(){
        return "Welcome to springboot application !!";
    }
    
    @GetMapping("/index")
    public String getIndex() {
    	return "Index page";
    }
}
