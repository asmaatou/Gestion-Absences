package com.example.studentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class StudentRequestDto {
    private Long id;
    private String Fname;
    private String Lname;
    private String email;
    private String adress;
}
