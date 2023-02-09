package com.example.studentservice.mappers;

import com.example.studentservice.dto.StudentRequestDto;
import com.example.studentservice.dto.StudentResponseDto;
import com.example.studentservice.entities.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public static Student requestToStudent(StudentRequestDto StudentRequestDto){
        Student student = new Student();
        BeanUtils.copyProperties(StudentRequestDto,student);
        return student;
    }

    public static StudentResponseDto studentToResponse(Student student){
        StudentResponseDto StudentResponseDto = new StudentResponseDto();
        BeanUtils.copyProperties(student,StudentResponseDto);
        return StudentResponseDto;
    }
}
