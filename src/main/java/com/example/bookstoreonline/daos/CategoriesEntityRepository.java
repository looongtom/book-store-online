package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.CategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoriesEntityRepository extends JpaRepository<CategoriesEntity, Integer> {
}