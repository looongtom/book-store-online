package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer> {
}