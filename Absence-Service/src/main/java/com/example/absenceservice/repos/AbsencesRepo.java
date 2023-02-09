package com.example.absenceservice.repos;

import com.example.absenceservice.entities.Absence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsencesRepo extends JpaRepository<Absence,Long> {
}
