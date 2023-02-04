package com.example.professorsservice.service;

import com.example.professorsservice.dto.ProfessorRequestDto;
import com.example.professorsservice.dto.ProfessorResponseDto;
import com.example.professorsservice.entities.Professor;
import com.example.professorsservice.mappers.ProfessorMapper;
import com.example.professorsservice.repos.ProfessorRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ProfessorServiceImp implements ProfessorService{
    @Autowired
    ProfessorRepo professorRepo;
    @Autowired
    ProfessorMapper professorMapper;
    @Override
    public List<ProfessorResponseDto> findAll() {
        return professorRepo.findAll().stream().map(professor -> professorMapper.professorToResponse(professor)).collect(Collectors.toList());
    }

    @Override
    public ProfessorResponseDto addProfessor(Long id, ProfessorRequestDto professorRequestDto) {
        Professor professor = professorMapper.requestToProfessor(professorRequestDto);
        professor.setFname(professorRequestDto.getFname());
        professor.setLname(professorRequestDto.getLname());
        professor.setEmail(professorRequestDto.getEmail());
        professor.setAdress(professorRequestDto.getAdress());
        professorRepo.save(professor);
        return professorMapper.professorToResponse(professor);
    }

    @Override
    public ProfessorResponseDto findById(Long id) {
        return null;
    }

    @Override
    public ProfessorResponseDto updateProfessor(Long id, ProfessorRequestDto professorRequestDto) {
        return null;
    }

    @Override
    public void deleteProfessor(Long id) {

    }
}
