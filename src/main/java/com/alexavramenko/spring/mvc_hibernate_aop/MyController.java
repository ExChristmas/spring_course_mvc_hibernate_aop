package com.alexavramenko.spring.mvc_hibernate_aop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public void showAllEmployees() {
    }

}