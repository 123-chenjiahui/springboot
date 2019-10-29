package com.itheima.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("thyme")
public class ThymeleafController {

    @RequestMapping("/hello")
    public String helloTest(Model model){
        model.addAttribute("name", "HAHA");
        return "22";
    }

}
