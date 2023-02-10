package com.example.absenceservice.service;

import com.example.absenceservice.models.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "COURS-SERVICE")
public interface CourseRestClient {

    @GetMapping(path="/cours/{id}")
    Course getCoursById(@PathVariable Long id);

    @GetMapping(path="/cours")
    List<Course> getCours();


}
