package com.example.coursesservice.controller;

import com.example.coursesservice.entities.Courses;
import com.example.coursesservice.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/json/courses/",produces = "application/json")
public class CoursesController {

    @Autowired
    CoursesService coursesService;

    @PostMapping("addCourses/{id}")
    public Courses addProfessor(@RequestBody Courses courses){
        return coursesService.addCourses(courses);
    }
    @GetMapping("allCourses")
    public List<Courses> getAll(){
        return coursesService.findAll();
    }

    @GetMapping("ProfessorById/{id}")
    public Courses CourseById(@PathVariable Long id){
        return coursesService.findById(id);
    }
    @PutMapping("update")
    public Courses updateCourse(@PathVariable Long id,@RequestBody Courses courses){
        return  coursesService.updateCourses(id, courses);
    }

    @DeleteMapping("delete/{id}")
    public  void deleteCourse(@PathVariable Long id){
        coursesService.deleteCourses(id);
    }

}
