package com.portfolio.geraldine.controller;

import com.portfolio.geraldine.model.education.Education;
import com.portfolio.geraldine.model.skills.Skills;
import com.portfolio.geraldine.repository.SkillsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
    @Autowired
    private SkillsRepository skillsRepository;

    @GetMapping
    public List<Skills> getAllSkills() {
        return skillsRepository.findAll();
    }

    @PostMapping
    public Skills createSkills(@RequestBody Skills skills){
        return skillsRepository.save(skills);
    }

    @DeleteMapping("/id")
    @Transactional
    public void deleteSkills(@PathVariable Long id){
        Skills skills = skillsRepository.getReferenceById(id);
        skillsRepository.delete(skills);
    }
}
