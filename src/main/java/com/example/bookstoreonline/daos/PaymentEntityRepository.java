package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentEntityRepository extends JpaRepository<PaymentEntity, Integer> {
}