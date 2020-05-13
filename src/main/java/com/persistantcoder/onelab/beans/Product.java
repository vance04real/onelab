package com.persistantcoder.onelab.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Evans K F C on May ,2020
 **/

@Entity
public class Product {
    @Id
    private int id ;
    private String name;
    private String imagePath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
