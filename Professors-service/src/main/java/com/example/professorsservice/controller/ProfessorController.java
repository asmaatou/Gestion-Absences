package com.example.professorsservice.controller;

import com.example.professorsservice.entities.Professor;
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
    public Professor addProfessor(@RequestBody Professor professor){
        return professorService.addProfessor(professor);
    }
    @GetMapping("allProfessor")
    public List<Professor> getAll(){
        return professorService.findAll();
    }

    @GetMapping("ProfessorById/{id}")
    public Professor professorById(@PathVariable Long id){
        return professorService.findById(id);
    }
    @PutMapping("update")
    public Professor updateProfessor(@PathVariable Long id,@RequestBody Professor professor){
        return  professorService.updateProfessor(id, professor);
    }

    @DeleteMapping("delete/{id}")
    public  void deleteProfessor(@PathVariable Long id){
        professorService.deleteProfessor(id);
    }
    
}
