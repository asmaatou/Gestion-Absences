package com.example.absenceservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Absence {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idStudent;
    private Long idProfessor;
    private Long idCourse;
    private Date dateAbsence;
}
