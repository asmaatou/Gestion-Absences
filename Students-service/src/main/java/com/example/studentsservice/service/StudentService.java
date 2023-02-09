package com.example.studentsservice.service;

import com.example.studentsservice.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student addStudent(Student student);
    Student findById(Long id);
    Student updateStudent(Long id,Student student);
    void deleteStudent(Long id);
}
