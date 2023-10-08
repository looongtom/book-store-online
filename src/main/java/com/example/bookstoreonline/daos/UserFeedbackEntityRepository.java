package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.UserFeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserFeedbackEntityRepository extends JpaRepository<UserFeedbackEntity, String> {
}