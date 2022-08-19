package com.example.adobootleg.repository;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ADObootleg")
public class StoryEntity extends TaskItemEntity {
    @Column(name="points")
    private float points;

    @OneToMany(cascade = { CascadeType.ALL})
    @JoinColumn(name="story_id")
    private List<TaskEntity> tasks;

    public StoryEntity(String name, String description, SprintEntity sprint, float points, List<TaskEntity> tasks) {
        super(name, description, sprint);
        this.points = points;
        this.tasks = tasks;
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
}
