package com.persistantcoder.onelab.exeptions;

/**
 * Created by Evans K F C on May ,2020
 **/
public class UserNotFoundException extends RuntimeException {



   public UserNotFoundException(String message){

        super(message);
    }
}
