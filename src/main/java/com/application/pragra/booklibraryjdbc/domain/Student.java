package com.application.pragra.booklibraryjdbc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.Instant;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int studentId;

    private String studentFirstname;


    private String studentLastname;

    private int studentAge;

    private String studentAddress;

    private LocalDate createdDate;


}
