package com.persistantcoder.onelab.converters;

import com.persistantcoder.onelab.beans.Gender;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by Evans K F C on May ,2020
 **/
public class StringToEnumConverter implements Converter<String, Gender> {


    @Override
    public Gender convert(String s) {
        switch (s) {
            case "Male":
                return Gender.MALE;
            case "Female":
                return Gender.FEMALE;
            default:
                return Gender.OTHER;
        }
    }
}
