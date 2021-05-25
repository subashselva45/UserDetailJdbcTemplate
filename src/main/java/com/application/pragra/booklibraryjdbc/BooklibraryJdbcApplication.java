package com.application.pragra.booklibraryjdbc;

import com.application.pragra.booklibraryjdbc.dao.Book;
import com.application.pragra.booklibraryjdbc.dao.StudentDao;
import com.application.pragra.booklibraryjdbc.dao.UserDao;
import com.application.pragra.booklibraryjdbc.domain.BookDao;
import com.application.pragra.booklibraryjdbc.domain.Student;
import com.application.pragra.booklibraryjdbc.practice.Practice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.time.LocalDate;

@SpringBootApplication
public class BooklibraryJdbcApplication {
//    @Autowired
//    private UserDao userDao;
    @Autowired
     private BookDao bookDao;







    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(BooklibraryJdbcApplication.class, args);
//        Practice p = context.getBean("practice",Practice.class);
//        p.display();
//        UserDao userDao = context.getBean("userDao", UserDao.class);
//        userDao.insertUserDetails();

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        //To  create a table
//        studentDao.createTable();

       // Student student = new Student(2,"Dhatch","Ganeshan",27,"Brampton", LocalDate.now());
       // To insert details
        // studentDao.insertStudentDetails(student);

        //To update info
       // studentDao.updateStudentInfo(student);

//       System.out.println(studentDao.getStudent(2));
//        System.out.println(studentDao.getAllStudentInfo());
       // System.out.println(studentDao.getAllStudentInfo());

       // studentDao.Delete(2);

//         Instant date = Instant.now();
//        System.out.println(date);



    }
//    @Bean
//    CommandLineRunner runner(){
//        return args -> {
//            userDao.insertUserDetails();
//        };
//    }
    @Bean
    CommandLineRunner runner(){
        return args -> {
           // bookDao.createTable();
            Book book = new Book(3,"Alchemist","DhatchMoorthy","Harley Collins",LocalDate.now(),234.56);
           // bookDao.insert(book);
            //bookDao.update(book);
            System.out.println(bookDao.getBookById(2));
            System.out.println(bookDao.getAllBooks());
            bookDao.delete(3);
        };
    }

}
