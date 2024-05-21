package com.midzia.hello_world.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/hello")
    public String showfirstView() {
        return "first-view";
    }
}
