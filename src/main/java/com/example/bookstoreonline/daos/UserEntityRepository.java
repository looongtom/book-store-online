package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserEntityRepository extends JpaRepository<UserEntity, String> {
}