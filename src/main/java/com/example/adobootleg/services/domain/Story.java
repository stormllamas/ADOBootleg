package com.example.adobootleg.services.domain;

import java.util.List;

public class Story extends TaskItem {
    private float points;

    private List<Task> tasks;

    public Story(String name, String description, Sprint sprint, float points, List<Task> tasks) {
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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
