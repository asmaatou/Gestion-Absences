package com.example.professorsservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ProfessorResponseDto {
    private Long id;
    private String Fname;
    private String Lname;
    private String email;
    private String adress;
}
