package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RoleEntityRepository extends JpaRepository<RoleEntity, String> {
}