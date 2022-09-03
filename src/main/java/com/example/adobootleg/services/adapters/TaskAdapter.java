package com.example.adobootleg.services.adapters;

import com.example.adobootleg.repository.SprintEntity;
import com.example.adobootleg.repository.StoryEntity;
import com.example.adobootleg.repository.TaskEntity;
import com.example.adobootleg.services.domain.Sprint;
import com.example.adobootleg.services.domain.Story;
import com.example.adobootleg.services.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class TaskAdapter {

    public Task toDomain(TaskEntity entity) {
        return new Task(
            entity.getId(),
            entity.getName(),
            entity.getDescription(),
            entity.getHoursEstimate(),
            entity.getHoursRemaining(),
            entity.getHoursCompleted()
        );
    }

    public TaskEntity toEntity(Task domain) {
        return new TaskEntity(
            domain.getId(),
            domain.getName(),
            domain.getDescription(),
            domain.getHoursEstimate(),
            domain.getHoursRemaining(),
            domain.getHoursCompleted()
        );
    }
}
