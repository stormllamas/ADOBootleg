package com.example.adobootleg.services.adapters;

import com.example.adobootleg.repository.StoryEntity;
import com.example.adobootleg.services.domain.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class StoryAdapter {

    @Autowired
    private TaskAdapter taskAdapter;

    @Autowired
    private BugAdapter bugAdapter;

    public StoryEntity toEntity(Story domain) {
        return new StoryEntity(
            domain.getId(),
            domain.getName(),
            domain.getDescription(),
            domain.getPoints(),
            domain.getTasks().stream().map(task -> taskAdapter.toEntity(task)).collect(Collectors.toList()),
            domain.getBugs().stream().map(bug -> bugAdapter.toEntity(bug)).collect(Collectors.toList())
        );
    }

    public Story toDomain(StoryEntity entity) {
        return new Story(
            entity.getId(),
            entity.getName(),
            entity.getDescription(),
            entity.getPoints(),
            entity.getTasks().stream().map(taskEntity -> taskAdapter.toDomain(taskEntity)).collect(Collectors.toList()),
            entity.getBugs().stream().map(bug -> bugAdapter.toDomain(bug)).collect(Collectors.toList())
        );
    }

}
