package com.example.adobootleg.services;

import com.example.adobootleg.repository.SprintEntity;
import com.example.adobootleg.repository.SprintRepository;
import com.example.adobootleg.services.adapters.SprintAdapter;
import com.example.adobootleg.services.domain.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

        Iterable<SprintEntity> sprintsFromSpringData = sprintRepository.findAll(Sort.by(Sort.Direction.DESC, "CreationDate"));

        return StreamSupport.stream(sprintsFromSpringData.spliterator(), false).map(
                entity -> sprintAdapter.toSprint(entity)
        ).collect(Collectors.toList());
    }

    @Override
    public List<Sprint> findAll(Sort sort) {
        Iterable<SprintEntity> sprintsFromSpringData = sprintRepository.findAll(sort);

        return StreamSupport.stream(sprintsFromSpringData.spliterator(), false).map(
                entity -> sprintAdapter.toSprint(entity)
        ).collect(Collectors.toList());
    }

//    @Override
//    public List<Sprint> findAllByOrderByCreationDateDesc() {
//
//        Iterable<SprintEntity> sprintsFromSpringData = sprintRepository.findAllByOrderByCreationDateDesc();
//
//        return StreamSupport.stream(sprintsFromSpringData.spliterator(), false).map(
//                entity -> sprintAdapter.toSprint(entity)
//        ).collect(Collectors.toList());
//    }

    @Override
    public Sprint findById(Long sprintId) {
        Optional<SprintEntity> sprintFromSpringData = sprintRepository.findById(sprintId);
        if (sprintFromSpringData.isPresent()) {
            return sprintAdapter.toSprint(sprintFromSpringData.get());
        } else {
            return null;
        }
    }

    @Override
    public Sprint save(Sprint sprint) {

        SprintEntity convertedSprint = sprintAdapter.toSprintEntity(sprint);

        SprintEntity savedSprintEntity = sprintRepository.save(convertedSprint);

        return sprintAdapter.toSprint(savedSprintEntity);
    }
}
