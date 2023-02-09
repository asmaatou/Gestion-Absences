package com.example.professorsservice.service;

import com.example.professorsservice.entities.Professor;
import com.example.professorsservice.repos.ProfessorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServiceImp implements ProfessorService{
    @Autowired
    ProfessorRepo professorRepo;

    @Override
    public List<Professor> findAll() {
        return professorRepo.findAll();
    }

    @Override
    public Professor addProfessor(Professor professor) {
        return professorRepo.save(professor);
    }

    @Override
    public Professor findById(Long id) {
        return professorRepo.findById(id).orElseThrow(()->new RuntimeException("Professor not found"));
    }

    @Override
    public Professor updateProfessor(Long id, Professor professor) {
        professor.setId(id);
        return professorRepo.save(professor);
    }

    @Override
    public void deleteProfessor(Long id) {
        professorRepo.deleteById(id);
    }
}
