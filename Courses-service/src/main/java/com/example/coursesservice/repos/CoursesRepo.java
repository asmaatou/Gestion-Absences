package com.example.coursesservice.repos;

import com.example.coursesservice.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepo extends JpaRepository<Courses,Long> {
}
