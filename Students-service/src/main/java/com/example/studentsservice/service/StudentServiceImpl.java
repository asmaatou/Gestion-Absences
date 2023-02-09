package com.example.studentsservice.service;


import com.example.studentsservice.entities.Student;
import com.example.studentsservice.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student findById(Long id) {
        return studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student not found"));
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        student.setId(id);
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
