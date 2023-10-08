package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.UserReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserReportEntityRepository extends JpaRepository<UserReportEntity, String> {
}