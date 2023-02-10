package com.example.absenceservice.entities;

import com.example.absenceservice.models.Course;
import com.example.absenceservice.models.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    private Student student;
    private Long studentID;
    @Transient
    private Course course;
    private Long courID;
    private int nbrAbsence;
}
