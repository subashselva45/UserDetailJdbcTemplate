package com.application.pragra.booklibraryjdbc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.Instant;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

    private int userId;
    @Column(name = "first_name")
    private String firstName;
    private String lastName;
    private String address;
    private Instant createDate;
}
