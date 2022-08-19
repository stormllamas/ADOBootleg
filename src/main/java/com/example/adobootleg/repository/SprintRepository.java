package com.example.adobootleg.repository;

import org.springframework.data.repository.CrudRepository;

public interface SprintRepository extends CrudRepository<SprintEntity, Integer> {

    SprintEntity findByName(String name);
}
