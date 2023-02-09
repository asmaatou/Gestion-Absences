package com.example.professorsservice;

import com.example.professorsservice.entities.Professor;
import com.example.professorsservice.repos.ProfessorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfessorsServiceApplication implements CommandLineRunner  {

    @Autowired
    private ProfessorRepo professorRepo;

    public static void main(String[] args) {
        SpringApplication.run(ProfessorsServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        professorRepo.save(new Professor(1,"Hassan","Asffar","hassanasffar22@gmail.com","Oulfa Casa"));
        professorRepo.save(new Professor(2,"Asmaa","Tounsi","asmatounsi11@gmail.com","Oulfa Casa"));
        professorRepo.save(new Professor(3,"Ayoub","Dairy","a.dairy9@gmail.com","Oulfa Casa"));
        professorRepo.save(new Professor(4,"Marouane","Saber","mrwnsaber12@gmail.com","Oulfa Casa"));
        professorRepo.save(new Professor(5,"Nada","Abousitre","nada.A9@gmail.com","Oulfa Casa"));
    }
}
