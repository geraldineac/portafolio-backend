package com.portfolio.geraldine.controller;

import com.portfolio.geraldine.model.education.Education;
import com.portfolio.geraldine.model.project.Project;
import com.portfolio.geraldine.repository.ProjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    // falta el metodo update
    @DeleteMapping("/id")
    @Transactional
    public void deleteProject(@PathVariable Long id){
        Project project = projectRepository.getReferenceById(id);
        projectRepository.delete(project);
    }
}
