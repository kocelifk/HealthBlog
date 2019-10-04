package com.example.healthblog;
import java.io.Serializable;

public class Food implements Serializable {
    private String name;
    private  String description;

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getPictureInteger() {
        return pictureInteger;
    }

    private  int pictureInteger;

    public Food(String name, String description,  int pictureInteger) {
        this.name = name;
        this.description = description;
        this.pictureInteger = pictureInteger;
    }
}