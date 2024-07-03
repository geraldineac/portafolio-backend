package com.portfolio.geraldine.repository;

import com.portfolio.geraldine.model.aboutme.Aboutme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutmeRepository extends JpaRepository<Aboutme, Long> {
}
