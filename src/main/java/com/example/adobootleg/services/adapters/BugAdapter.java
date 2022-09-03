package com.example.adobootleg.services.adapters;

import com.example.adobootleg.repository.BugEntity;
import com.example.adobootleg.repository.TaskEntity;
import com.example.adobootleg.services.domain.Bug;
import com.example.adobootleg.services.domain.Task;
import org.springframework.stereotype.Service;

@Service
public class BugAdapter {

    public Bug toDomain(BugEntity entity) {
        return new Bug(
            entity.getId(),
            entity.getName(),
            entity.getDescription(),
            entity.getPriority()
        );
    }

    public BugEntity toEntity(Bug domain) {
        return new BugEntity(
            domain.getId(),
            domain.getName(),
            domain.getDescription(),
            domain.getPriority()
        );
    }
}
