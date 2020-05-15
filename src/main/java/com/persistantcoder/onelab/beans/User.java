package com.persistantcoder.onelab.beans;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Evans K F C on May ,2020
 **/

@Entity
public class User {

    @Id
    private int id;
    @Size(min = 6 ,message = "{username.validation}")
    private String userName;

    @Pattern(regexp="((?=.*[A-Z]).{6,10})", message = "{password.validation}")
    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull(message = "{activity.validation}")
    private String activity ;

    @NotBlank(message = "{firstname.validation}")
    private String firstName;
    private String lastName;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date dateOfBirth;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




}
