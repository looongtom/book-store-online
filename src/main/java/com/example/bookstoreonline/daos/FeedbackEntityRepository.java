package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FeedbackEntityRepository extends JpaRepository<FeedbackEntity, Integer> {
}