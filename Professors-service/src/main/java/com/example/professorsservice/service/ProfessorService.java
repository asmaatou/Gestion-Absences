package com.example.professorsservice.service;

import com.example.professorsservice.dto.ProfessorRequestDto;
import com.example.professorsservice.dto.ProfessorResponseDto;

import java.util.List;

public interface ProfessorService {
    List<ProfessorResponseDto> findAll();
    ProfessorResponseDto addProfessor(Long id, ProfessorRequestDto professorRequestDto);
    ProfessorResponseDto findById(Long id);
    ProfessorResponseDto updateProfessor(Long id,ProfessorRequestDto professorRequestDto);
    void deleteProfessor(Long id);
}
