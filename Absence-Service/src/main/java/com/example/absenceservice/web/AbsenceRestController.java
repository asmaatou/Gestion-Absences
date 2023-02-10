package com.example.absenceservice.web;

import com.example.absenceservice.entities.Absence;
import com.example.absenceservice.models.Course;
import com.example.absenceservice.models.Student;
import com.example.absenceservice.repos.AbsencesRepo;
import com.example.absenceservice.service.CourseRestClient;
import com.example.absenceservice.service.StudentRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class AbsenceRestController {

   @Autowired
   AbsencesRepo absencesRepo;
    @Autowired
    CourseRestClient courseRestClient;
    @Autowired
    StudentRestClient studentRestClient;

    @GetMapping("/Absences")

    public List<Absence> getAll(){
        List<Absence> absences=absencesRepo.findAll();
        return getAbsence(absences);

    }

    @GetMapping("/Absences/students/{id}")
    public List<Absence> getAbsencebyStudentsID(@PathVariable  Long id){
        List<Absence> absences=absencesRepo.findAbsencesByStudentID(id);
        return getAbsence(absences);
    }

    @Transactional
    @DeleteMapping("/absence/{ids}/{idc}")
    public void deleteAbsence(@PathVariable Long ids,@PathVariable Long idc){
        absencesRepo.deleteAbsenceByStudentIDAndCourID(ids, idc);
    }

    @PostMapping("/absence")
    public Absence addAbsence(@RequestBody Absence absence ){
        Student student= studentRestClient.getStudentById(absence.getStudentID());
        Course cour= courseRestClient.getCoursById(absence.getCourID());

        if(cour==null || student==null){
            return absence;
        }else{

           Absence absence1 = absencesRepo.findAbsencesByStudentIDAndCourID(student.getId(), cour.getId());
           if(absence1 != null){
               absence1.setNbrAbsence(absence1.getNbrAbsence()+ absence.getNbrAbsence());
               return absencesRepo.save(absence1);
           }
            return absencesRepo.save(absence);
        }

    }

    public List<Absence> getAbsence( List<Absence> absences){
        absences.forEach(absence -> {
            absence.setCourse(courseRestClient.getCoursById(absence.getCourID()));
            absence.setStudent(studentRestClient.getStudentById(absence.getStudentID()));

        });
        return absences;
    }

}
