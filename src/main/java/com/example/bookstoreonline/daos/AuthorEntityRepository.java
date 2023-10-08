package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

@Repository

public interface AuthorEntityRepository extends JpaRepository<AuthorEntity, Integer> {
}