package com.example.studentsservice.service;

import com.example.studentservice.dto.StudentRequestDto;
import com.example.studentservice.dto.StudentResponseDto;
import com.example.studentservice.entities.Student;
import com.example.studentservice.mappers.StudentMapper;
import com.example.studentservice.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<StudentResponseDto> findAll() {
        return studentRepo.findAll().stream().map(student -> studentMapper.studentToResponse(student)).collect(Collectors.toList());
    }

    @Override
    public StudentResponseDto addStudent(Long id, StudentRequestDto studentRequestDto) {
        Student student = studentMapper.requestToStudent(studentRequestDto);
        student.setFname(studentRequestDto.getFname());
        student.setLname(studentRequestDto.getLname());
        student.setEmail(studentRequestDto.getEmail());
        student.setAdress(studentRequestDto.getAdress());
        studentRepo.save(student);
        return studentMapper.studentToResponse(student);
    }

    @Override
    public StudentResponseDto findById(Long id) {
        Student student = studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student not found"));
        return studentMapper.studentToResponse(student);
    }

    @Override
    public StudentResponseDto updateStudent(Long id, StudentRequestDto studentRequestDto) {
        Student student = studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student Not found"));
        student.setFname(studentRequestDto.getFname());
        student.setLname(studentRequestDto.getLname());
        student.setEmail(studentRequestDto.getEmail());
        student.setAdress(studentRequestDto.getAdress());
        studentRepo.save(student);
        return StudentMapper.studentToResponse(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
