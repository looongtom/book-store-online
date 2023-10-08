package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.CategoriesReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoriesReportEntityRepository extends JpaRepository<CategoriesReportEntity, Integer> {
}