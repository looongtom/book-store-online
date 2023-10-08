package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderEntityRepository extends JpaRepository<OrderEntity, Integer> {
}