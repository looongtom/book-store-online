package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackEntityRepository extends JpaRepository<FeedbackEntity, Integer> {
}