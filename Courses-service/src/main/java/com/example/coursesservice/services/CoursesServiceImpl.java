package com.example.coursesservice.services;

import com.example.coursesservice.entities.Courses;
import com.example.coursesservice.repos.CoursesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService{

    @Autowired
    CoursesRepo coursesRepo;

    @Override
    public List<Courses> findAll() {
        return coursesRepo.findAll();    }

    @Override
    public Courses addCourses(Courses courses) {
        return coursesRepo.save(courses);
    }

    @Override
    public Courses findById(Long id) {
        return coursesRepo.findById(id).orElseThrow(()->new RuntimeException("Course not found"));
    }

    @Override
    public Courses updateCourses(Long id, Courses courses) {
        courses.setId(id);
        return coursesRepo.save(courses);
    }

    @Override
    public void deleteCourses(Long id) {
        coursesRepo.deleteById(id);
    }
}
