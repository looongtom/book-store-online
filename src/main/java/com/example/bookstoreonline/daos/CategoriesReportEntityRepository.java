package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.CategoriesReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesReportEntityRepository extends JpaRepository<CategoriesReportEntity, Integer> {
}