package com.example.coursesservice;

import com.example.coursesservice.entities.Courses;
import com.example.coursesservice.repos.CoursesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoursesServiceApplication implements CommandLineRunner {

    @Autowired
    CoursesRepo coursesRepo;

    public static void main(String[] args) {
        SpringApplication.run(CoursesServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        coursesRepo.save(new Courses(1,"Course1"));
        coursesRepo.save(new Courses(2,"Course2"));
        coursesRepo.save(new Courses(3,"Course3"));
        coursesRepo.save(new Courses(4,"Course4"));
        coursesRepo.save(new Courses(5,"Course5"));
    }

}
