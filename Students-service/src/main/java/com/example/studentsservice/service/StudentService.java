package com.example.studentsservice.service;

import com.example.studentservice.dto.StudentRequestDto;
import com.example.studentservice.dto.StudentResponseDto;
import com.example.studentservice.entities.Student;

import java.util.List;

public interface StudentService {
    List<StudentResponseDto> findAll();
    StudentResponseDto addStudent(Long id, StudentRequestDto studentRequestDto);
    StudentResponseDto findById(Long id);
    StudentResponseDto updateStudent(Long id,StudentRequestDto studentRequestDto);
    void deleteStudent(Long id);
}
