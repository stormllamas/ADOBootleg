package com.example.adobootleg.services;

import com.example.adobootleg.repository.StoryEntity;
import com.example.adobootleg.services.domain.Story;
import org.springframework.stereotype.Service;

@Service
public class StoryAdapter {

    public StoryEntity toEntity(Story domain) {
        return new StoryEntity(domain.getId(), domain.getName(), domain.getDescription(), domain.getPoints());
    }

    public Story toDomain(StoryEntity entity) {
        return new Story(entity.getId(), entity.getName(), entity.getDescription(), entity.getPoints());
    }

}
