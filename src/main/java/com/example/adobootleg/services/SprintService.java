package com.example.adobootleg.services;

import com.example.adobootleg.services.domain.Sprint;

import java.util.List;

public interface SprintService {
    public List<Sprint> findAll();
    public Sprint findById(int sprintId);
    public Sprint findByName(String sprintName);
    public Sprint save(Sprint sprint);
    public void deleteById(int sprintId);
}
