package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.NameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NameEntityRepository extends JpaRepository<NameEntity, Integer> {
}