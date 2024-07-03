package com.portfolio.geraldine.controller;

import com.portfolio.geraldine.model.education.Education;
import com.portfolio.geraldine.model.workexperience.WorkExperience;
import com.portfolio.geraldine.repository.WorkExperienceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workexperience")
public class WorkExperienceController{

    @Autowired
    public WorkExperienceRepository workExperienceRepository;

    @GetMapping
    public List<WorkExperience> getAllWorkExperiences(){
        return workExperienceRepository.findAll();
    }

    @PostMapping
    public WorkExperience createWorkExperience(@RequestBody WorkExperience workExperience){
        return workExperienceRepository.save(workExperience);
    }
    @DeleteMapping("/id")
    @Transactional
    public void deleteWorkExperience(@PathVariable Long id){
        WorkExperience workExperience = workExperienceRepository.getReferenceById(id);
        workExperienceRepository.delete(workExperience);
    }
}
