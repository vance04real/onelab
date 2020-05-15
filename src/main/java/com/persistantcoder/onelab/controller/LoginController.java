package com.persistantcoder.onelab.controller;

/**
 * Created by Evans K F C on May ,2020
 **/

import antlr.StringUtils;
import com.persistantcoder.onelab.beans.Login;
import com.persistantcoder.onelab.beans.User;
import com.persistantcoder.onelab.exeptions.UserNotFoundException;
import com.persistantcoder.onelab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login") Login login ,Model model){


        final User user = userRepository.findByUserName(login.getUsername());

        if(user==null){

            throw new UserNotFoundException("User Could not be Found");

        }

        model.addAttribute("user" ,user);
        return "search";
    }

    @ExceptionHandler(UserNotFoundException.class)
    public String handleException(){
        System.out.println("In exception handler of Login Controller");

        return "error";
    }
}
