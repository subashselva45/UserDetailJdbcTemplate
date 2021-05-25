package com.application.pragra.booklibraryjdbc.dao;

import com.application.pragra.booklibraryjdbc.domain.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {

    private JdbcTemplate jdbcTemplate;

    public StudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createTable(){
        String sql = "CREATE TABLE STUDENT(Student_Id int primary key,Student_firstname varchar(50)," +
                "Student_lastname varchar(50),Student_age int,Student_address varchar(100),Created_Date date)";
        jdbcTemplate.execute(sql);
    }

    public void insertStudentDetails(Student student){
        String sql ="INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
        System.out.println( jdbcTemplate.update(sql,student.getStudentId(),student.getStudentFirstname(),student.getStudentLastname(),student.getStudentAge(),
        student.getStudentAddress(),student.getCreatedDate()));
    }

    public void updateStudentInfo(Student student){
        String sql ="UPDATE STUDENT SET created_Date=? WHERE student_Id =?";
        jdbcTemplate.update(sql,new Object[]{student.getCreatedDate(),student.getStudentId()});
    }

    public Student getStudent(int id){
        String sql = "Select * from Student where Student_Id =?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Student>(Student.class),id);
    }

    public List<Student> getAllStudentInfo(){
        String sql ="SELECT * FROM STUDENT";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }

    public void Delete(int id){
        String sql="Delete from Student where Student_Id =?";
        jdbcTemplate.update(sql,id);
    }
}
