package com.portfolio.geraldine.repository;

import com.portfolio.geraldine.model.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
