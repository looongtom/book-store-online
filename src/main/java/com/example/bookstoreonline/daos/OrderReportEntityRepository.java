package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.OrderReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReportEntityRepository extends JpaRepository<OrderReportEntity, Integer> {
}