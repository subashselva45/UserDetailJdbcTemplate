package com.application.pragra.booklibraryjdbc.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("87")
    private String doorNo;
    @Value("Daffodil")
    private String Street;
    @Value("Bramp")
    private String city;
    @Value("canada")
    private String country;



}
