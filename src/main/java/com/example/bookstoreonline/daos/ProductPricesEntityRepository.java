package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.ProductPricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductPricesEntityRepository extends JpaRepository<ProductPricesEntity, Integer> {
}