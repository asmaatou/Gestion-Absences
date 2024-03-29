package com.example.absenceservice.service;

import com.example.absenceservice.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@FeignClient(name="STUDENTS-SERVICE")
@RestController
public interface StudentRestClient {

    @GetMapping(path="/students/{id}")
    Student getStudentById(@PathVariable Long id);

    @GetMapping(path="/students")
    List<Student> getStudents();

}
