package com.example.adobootleg.services;

import com.example.adobootleg.repository.SprintEntity;
import com.example.adobootleg.repository.SprintRepository;
import com.example.adobootleg.services.domain.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SprintServiceImpl implements SprintService {
//    private static List<Sprint> sprints = new ArrayList<>();
//
//    static {
////        Task task1 = new Task(1,"Task 1", "Implement A", null,null);
////        Task task2 = new Task(2,"Task 2", "Implement B", null,null);
////        Task task3 = new Task(3,"Task 3", "Implement C", null,null);
//        Sprint sprint1 = new Sprint(1,"Sprint 1", new Date(), new ArrayList<Task>(), new ArrayList<Bug>(), new ArrayList<Story>());
////        task1.setSprint(sprint1);
////        task2.setSprint(sprint1);
////        task3.setSprint(sprint1);
//        sprints.add(sprint1);
//        sprints.add(new Sprint(2,"Sprint 2", new Date(), new ArrayList<Task>(), new ArrayList<Bug>(), new ArrayList<Story>()));
//        sprints.add(new Sprint(3,"Sprint 3", new Date(), new ArrayList<Task>(), new ArrayList<Bug>(), new ArrayList<Story>()));
//    }

    @Autowired
    private SprintRepository sprintRepository;

    public SprintServiceImpl() {
    }

    @Override
    public List<SprintEntity> findAll() {
        List<SprintEntity> list = new ArrayList<>();
        for(SprintEntity sprint: sprintRepository.findAll()){
            list.add(sprint);
        }
        return list;
    }

    @Override
    public SprintEntity findById(int sprintId) {
        return sprintRepository.findById(sprintId).get();
    }

    @Override
    public SprintEntity findByName(String sprintName) {
        return sprintRepository.findByName(sprintName);
    }

    @Override
    public SprintEntity save(SprintEntity sprint) {
        return sprintRepository.save(sprint);
    }

    @Override
    public void deleteById(int sprintId) {
        sprintRepository.deleteById(sprintId);
    }
}
