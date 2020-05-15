package com.persistantcoder.onelab.exeptions;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Evans K F C on May ,2020
 **/
@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public String handleException(){
        System.out.println("In ApplicationExceptionHandler  of Login Controller");

        return "error";
    }
}
