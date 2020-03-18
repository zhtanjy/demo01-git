package com.jdyy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 谭俊彦
 * @version 1.0 2020-03-18 15:37
 * @description
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello world 2020";
    }
}
