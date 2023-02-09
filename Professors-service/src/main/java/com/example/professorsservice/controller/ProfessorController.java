package com.example.professorsservice.controller;

import com.example.professorsservice.dto.ProfessorRequestDto;
import com.example.professorsservice.dto.ProfessorResponseDto;
import com.example.professorsservice.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/json/professors/",produces = "application/json")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;

    @PostMapping("addProfessor/{id}")
    public ProfessorResponseDto addProfessor(@PathVariable Long id, @RequestBody ProfessorRequestDto professorRequestDto){
        return professorService.addProfessor(id,professorRequestDto);
    }
    @GetMapping("allProfessor")
    public List<ProfessorResponseDto> getAll(){
        return professorService.findAll();
    }

    @GetMapping("ProfessorById/{id}")
    public ProfessorResponseDto professorById(@PathVariable Long id){
        return professorService.findById(id);
    }
    @PutMapping("update")
    public ProfessorResponseDto updateProfessor(@PathVariable Long id,@RequestBody ProfessorRequestDto dto){
        return  professorService.updateProfessor(id, dto);
    }

    @DeleteMapping("delete/{id}")
    public  void deleteProfessor(@PathVariable Long id){
        professorService.deleteProfessor(id);
    }
    
}
