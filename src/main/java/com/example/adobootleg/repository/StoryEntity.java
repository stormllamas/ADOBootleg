package com.example.adobootleg.repository;

import com.example.adobootleg.services.domain.Task;

import javax.persistence.*;
import java.util.List;

@Entity
public class StoryEntity extends TaskItemEntity {
    private float points;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TaskEntity> tasks;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BugEntity> bugs;

    public StoryEntity() {
    }

    public StoryEntity(Long id, String name, String description, float points, List<TaskEntity> tasks, List<BugEntity> bugs) {
        super(id, name, description);
        this.points = points;
        this.tasks = tasks;
        this.bugs = bugs;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    public List<TaskEntity> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskEntity> tasks) {
        this.tasks = tasks;
    }

    public List<BugEntity> getBugs() {
        return bugs;
    }

    public void setBugs(List<BugEntity> bugs) {
        this.bugs = bugs;
    }
}
