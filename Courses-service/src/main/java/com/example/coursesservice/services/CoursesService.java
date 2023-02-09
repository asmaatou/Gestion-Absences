package com.example.coursesservice.services;

import com.example.coursesservice.entities.Courses;

import java.util.List;

public interface CoursesService {
    List<Courses> findAll();
    Courses addCourses(Courses courses);
    Courses findById(Long id);
    Courses updateCourses(Long id,Courses courses);
    void deleteCourses(Long id);
}
