package com.application.pragra.booklibraryjdbc.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {

    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPublication;
    private LocalDate createDate;
    private double price;







}
