package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.OrderReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderReportEntityRepository extends JpaRepository<OrderReportEntity, Integer> {
}