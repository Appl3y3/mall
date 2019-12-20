package com.appleye.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Appleye
 * @version 1.0
 * @date 2019/11/1 0001
 * @time 16:29
 */
@Controller
public class WelcomeController {
    @GetMapping("/index")
    @ResponseBody
    public String welcome(){
        return "Welcome!";
    }

}
