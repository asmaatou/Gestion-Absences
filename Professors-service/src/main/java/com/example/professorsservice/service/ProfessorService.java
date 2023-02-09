package com.example.professorsservice.service;

import com.example.professorsservice.entities.Professor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProfessorService {
    List<Professor> findAll();
    Professor addProfessor(Professor professor);
    Professor findById(Long id);
    Professor updateProfessor(Long id,Professor professor);
    void deleteProfessor(Long id);
}
