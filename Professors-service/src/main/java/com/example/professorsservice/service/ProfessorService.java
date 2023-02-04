package com.example.professorsservice.service;

import com.example.professorsservice.dto.ProfessorRequestDto;
import com.example.professorsservice.dto.ProfessorResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessorService {
    List<ProfessorResponseDto> findAll();
    ProfessorResponseDto addProfessor(Long id, ProfessorRequestDto professorRequestDto);
    ProfessorResponseDto findById(Long id);
    ProfessorResponseDto updateProfessor(Long id,ProfessorRequestDto professorRequestDto);
    void deleteProfessor(Long id);
}
