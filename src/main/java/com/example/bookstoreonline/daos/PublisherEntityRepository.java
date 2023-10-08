package com.example.bookstoreonline.daos;

import com.example.bookstoreonline.models.PublisherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PublisherEntityRepository extends JpaRepository<PublisherEntity, Integer> {
}