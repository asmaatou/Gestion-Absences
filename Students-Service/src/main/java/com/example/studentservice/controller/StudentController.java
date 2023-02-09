package com.example.studentservice.controller;

import com.example.studentservice.dto.StudentRequestDto;
import com.example.studentservice.dto.StudentResponseDto;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/json/students/",produces = "application/json")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("addStudent/{id}")
    public StudentResponseDto addStudent(@PathVariable Long id, @RequestBody StudentRequestDto studentRequestDto){
        return studentService.addStudent(id,studentRequestDto);
    }

    @GetMapping("allStudent")
    public List<StudentResponseDto> getAll(){
        return studentService.findAll();
    }

    @GetMapping("StudentById/{id}")
    public StudentResponseDto studentById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @PutMapping("update")
    public StudentResponseDto updateStudent(@PathVariable Long id,@RequestBody StudentRequestDto dto){
        return  studentService.updateStudent(id, dto);
    }

    @DeleteMapping("delete/{id}")
    public  void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
