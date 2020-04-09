package com.ae.exercise403;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String course(){
        return "course";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/teacher")
    public String teacher(){
        return "teacher";
    }
    @RequestMapping("/student")
    public String student(){
        return "student";
    }
}
