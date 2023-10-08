package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.ShoppingCartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ShoppingCartEntityRepository extends JpaRepository<ShoppingCartEntity, Integer> {
}