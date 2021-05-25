package com.application.pragra.booklibraryjdbc.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    private int custId;
    private String custName;
    private String  custAge;
    private String custAddress;
    private LocalDate createDate;


}
