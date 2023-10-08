package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.ProductReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductReportEntityRepository extends JpaRepository<ProductReportEntity, Integer> {
}