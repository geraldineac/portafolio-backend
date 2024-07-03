package com.portfolio.geraldine.controller;

import com.portfolio.geraldine.model.education.Education;
import com.portfolio.geraldine.repository.EducationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/educations")
public class EducationController {
    @Autowired
    private EducationRepository educationRepository;

    @GetMapping
    public List<Education> getAllEducations() {
        return educationRepository.findAll();
    }
    @PostMapping
    public Education createEducation(@RequestBody Education education) {
        return educationRepository.save(education);
    }

   // @PutMapping

    @DeleteMapping("/id")
    @Transactional
    public void deleteEducation(@PathVariable Long id){
        Education education = educationRepository.getReferenceById(id);
        educationRepository.delete(education);
    }

}
