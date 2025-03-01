package com.fengshuisystem.demo.repository;

import com.fengshuisystem.demo.entity.ConsultationCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationCategoryRepository extends JpaRepository<ConsultationCategory, Integer> {
}
