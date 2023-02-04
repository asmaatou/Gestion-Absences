package com.example.professorsservice.mappers;

import com.example.professorsservice.dto.ProfessorRequestDto;
import com.example.professorsservice.dto.ProfessorResponseDto;
import com.example.professorsservice.entities.Professor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProfessorMapper {
    public static Professor requestToProfessor(ProfessorRequestDto ProfessorRequestDto){
        Professor professor = new Professor();
        BeanUtils.copyProperties(ProfessorRequestDto,professor);
        return professor;
    }

    public static ProfessorResponseDto professorToResponse(Professor professor){
        ProfessorResponseDto ProfessorResponseDto = new ProfessorResponseDto();
        BeanUtils.copyProperties(professor,ProfessorResponseDto);
        return ProfessorResponseDto;
    }
}
