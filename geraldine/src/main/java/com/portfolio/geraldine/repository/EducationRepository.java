package com.portfolio.geraldine.repository;

import com.portfolio.geraldine.model.education.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}
