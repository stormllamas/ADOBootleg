package com.example.adobootleg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SprintRepository extends JpaRepository<SprintEntity, Long> {
    SprintEntity findByName(String name);
//    List<SprintEntity> findAllByOrderByCreationDateDesc();
}
