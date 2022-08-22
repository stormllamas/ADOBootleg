package com.example.adobootleg.services;

import com.example.adobootleg.repository.SprintEntity;
import com.example.adobootleg.repository.SprintRepository;
import com.example.adobootleg.services.domain.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SprintServiceImpl implements SprintService {


    @Autowired
    private SprintRepository sprintRepository;

    @Autowired
    private SprintAdapter sprintAdapter;

    public SprintServiceImpl() {
    }

    @Override
    public List<Sprint> findAll() {

        Iterable<SprintEntity> sprintsFromSpringData = sprintRepository.findAll();

        return StreamSupport.stream(sprintsFromSpringData.spliterator(), false).map(
                entity -> sprintAdapter.toSprint(entity)
        ).collect(Collectors.toList());
    }

    @Override
    public Sprint save(Sprint sprint) {

        SprintEntity convertedSprint = sprintAdapter.toSprintEntity(sprint);

        SprintEntity savedSprintEntity = sprintRepository.save(convertedSprint);

        return sprintAdapter.toSprint(savedSprintEntity);
    }
}
