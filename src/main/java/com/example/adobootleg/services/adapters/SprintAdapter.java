package com.example.adobootleg.services.adapters;

import com.example.adobootleg.repository.SprintEntity;
import com.example.adobootleg.services.domain.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class SprintAdapter {

    @Autowired
    private StoryAdapter storyAdapter;

    public Sprint toSprint(SprintEntity entity) {
        return new Sprint(
            entity.getId(),
            entity.getName(),
            entity.getCreationDate(),
            entity.getStories().stream().map(storyEntity -> storyAdapter.toDomain(storyEntity)).collect(Collectors.toList())
        );
    }

    public SprintEntity toSprintEntity(Sprint domain) {
        return new SprintEntity(domain.getId(), domain.getName(), domain.getCreationDate(),
                domain.getStories().stream().map(story -> storyAdapter.toEntity(story)).collect(Collectors.toList()));
    }

}
