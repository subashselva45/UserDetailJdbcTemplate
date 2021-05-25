package com.application.pragra.booklibraryjdbc.domain;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
    private NamedParameterJdbcTemplate template;

    public CustomerDao(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public void createTable(){
        String sql ="create table Customer(Cust_Id int,Cust_Name varchar(15),Cust_Age int,Cust_Address varchar(100), Create_Date Date)";
        //template.execute(sql,);
    }
}
