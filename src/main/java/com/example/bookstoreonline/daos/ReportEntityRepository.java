package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReportEntityRepository extends JpaRepository<ReportEntity, Integer> {
}