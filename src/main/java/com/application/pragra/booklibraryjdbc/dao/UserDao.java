package com.application.pragra.booklibraryjdbc.dao;

import com.application.pragra.booklibraryjdbc.domain.UserDetails;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertUserDetails(){

        String sql = "Insert into user_detail values(8,'sasi','karthick','kovilpatti','2020-06-05',14,'male',0)";
       // String sql = "INSERT INTO USER_DETAIL values("+ userDetails.getUserId()+ "," + userDetails.getFirstName()+ "," +userDetails.getLastName()+ "," +userDetails.getAddress()+ "," +userDetails.getCreateDate()+")";
        jdbcTemplate.update(sql);
    }
}
