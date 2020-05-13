package com.persistantcoder.onelab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Evans K F C on May ,2020
 **/

@Controller
public class HomeController {

@GetMapping("/home")
    public String goHome(){
    System.out.println("In Home Controller");

    return "index";
}

    @GetMapping("/goToSearch")
    public String goToSearch(){
        System.out.println("In Home Controller");

        return "search";
    }

    @GetMapping("/goToLogin")
    public String goToLogin(){
        System.out.println("In Home Controller");

        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration(){
        System.out.println("In Home Controller");

        return "register";
    }

}
