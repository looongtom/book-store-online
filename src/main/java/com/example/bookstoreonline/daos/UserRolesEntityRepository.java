package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.UserRolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRolesEntityRepository extends JpaRepository<UserRolesEntity, String> {
}