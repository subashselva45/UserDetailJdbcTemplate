package com.application.pragra.booklibraryjdbc.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Practice {

    public String name;
    public int age;
    public String city;
    public String country;
    @Autowired
    public Address address;



    public void display(){
        System.out.println("it worked");
    }
}
