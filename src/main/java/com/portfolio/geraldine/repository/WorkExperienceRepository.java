package com.portfolio.geraldine.repository;

import com.portfolio.geraldine.model.workexperience.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkExperienceRepository  extends JpaRepository<WorkExperience, Long> {
}
