package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.ProductShoppingCartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductShoppingCartEntityRepository extends JpaRepository<ProductShoppingCartEntity, Integer> {
}