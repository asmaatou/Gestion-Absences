package com.example.absenceservice.repos;

import com.example.absenceservice.entities.Absence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbsencesRepo extends JpaRepository<Absence,Long> {
    List<Absence> findAbsencesByStudentID(Long Id);
    Absence findAbsencesByStudentIDAndCourID(Long Ids,Long Idc);
    void deleteAbsenceByStudentIDAndCourID(Long Ids,Long Idc);
}
