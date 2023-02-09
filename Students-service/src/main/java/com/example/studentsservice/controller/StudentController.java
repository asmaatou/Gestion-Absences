package com.example.studentsservice.controller;

import com.example.studentsservice.entities.Student;
import com.example.studentsservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/json/student/",produces = "application/json")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("addStudent/{id}")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("allStudent")
    public List<Student> getAll(){
        return studentService.findAll();
    }

    @GetMapping("StudentById/{id}")
    public Student studentById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @PutMapping("update/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        return  studentService.updateStudent(id, student);
    }

    @DeleteMapping("delete/{id}")
    public  void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
