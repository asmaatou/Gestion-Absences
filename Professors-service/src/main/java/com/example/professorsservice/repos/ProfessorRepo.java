package com.example.professorsservice.repos;

import com.example.professorsservice.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepo extends JpaRepository<Professor,Long> {
}
