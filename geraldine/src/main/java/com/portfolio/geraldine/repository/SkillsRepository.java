package com.portfolio.geraldine.repository;

import com.portfolio.geraldine.model.skills.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepository extends JpaRepository<Skills, Long> {
}
