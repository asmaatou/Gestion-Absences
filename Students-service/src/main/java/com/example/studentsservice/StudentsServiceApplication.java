package com.example.studentsservice;

import com.example.studentsservice.entities.Student;
import com.example.studentsservice.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsServiceApplication implements CommandLineRunner {

    @Autowired
    private StudentRepo studentRepo;

    public static void main(String[] args) {
        SpringApplication.run(StudentsServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepo.save(new Student(1,"Hassan","Asffar","hassanasffar22@gmail.com","Oulfa Casa"));
        studentRepo.save(new Student(2,"Asmaa","Tounsi","asmatounsi11@gmail.com","Oulfa Casa"));
        studentRepo.save(new Student(3,"Ayoub","Dairy","a.dairy9@gmail.com","Oulfa Casa"));
        studentRepo.save(new Student(4,"Marouane","Saber","mrwnsaber12@gmail.com","Oulfa Casa"));
        studentRepo.save(new Student(5,"Nada","Abousitre","nada.A9@gmail.com","Oulfa Casa"));
    }

}
