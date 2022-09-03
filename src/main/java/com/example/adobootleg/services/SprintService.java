package com.example.adobootleg.services;

import com.example.adobootleg.services.domain.Sprint;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SprintService {
     List<Sprint> findAll();
     List<Sprint> findAll(Sort sort);
//     List<Sprint> findAllByOrderByCreationDateDesc();
     Sprint findById(Long sprintId);
//    public Sprint findByName(String sprintName);
     Sprint save(Sprint sprint);
//    public void deleteById(int sprintId);
}
