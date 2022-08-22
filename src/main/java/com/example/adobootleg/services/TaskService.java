package com.example.adobootleg.services;

import com.example.adobootleg.services.domain.Task;

import java.util.List;

public interface TaskService {
    public List<Task> findAll();
    public Task findById(Long sprintId);
    public Task findByName(String sprintName);
    public Task save(Task sprint);
    public void deleteById(Long sprintId);
}
