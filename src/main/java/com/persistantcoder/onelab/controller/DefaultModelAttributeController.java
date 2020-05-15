package com.persistantcoder.onelab.controller;

import com.persistantcoder.onelab.beans.Login;
import com.persistantcoder.onelab.beans.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evans K F C on May ,2020
 **/

@ControllerAdvice
public class DefaultModelAttributeController {

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
