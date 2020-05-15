package com.persistantcoder.onelab.controller;

import com.persistantcoder.onelab.beans.Login;
import com.persistantcoder.onelab.beans.User;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evans K F C on May ,2020
 **/

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome() {
        System.out.println("In Home Controller");

        return "index";
    }

    @GetMapping("/goToSearch")
    public String goToSearch() {
        System.out.println("In Home Controller");

        return "search";
    }

    @GetMapping("/goToLogin")
    public String goToLogin() {
        System.out.println("In Home Controller");

        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration() {
        System.out.println("In Home Controller");

        return "register";
    }

    @ModelAttribute("newuser")
    public User getDefaultUser() {

        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> genderItems() {

        return Arrays.asList(new String[]{"Male","Female","Other"});
    }

    @ModelAttribute("login")
    public Login getDefaultLogin() {

        return new Login();
    }

}
