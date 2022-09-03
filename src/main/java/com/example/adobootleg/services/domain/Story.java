package com.example.adobootleg.services.domain;

import java.util.List;

public class Story extends TaskItem {
    private float points;
    private List<Task> tasks;
    private List<Bug> bugs;

    public Story(Long id, String name, String description) {
        super(id, name, description);
    }

    public Story(Long id, String name, String description, float points, List<Task> tasks, List<Bug> bugs) {
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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Bug> getBugs() {
        return bugs;
    }

    public void setBugs(List<Bug> bugs) {
        this.bugs = bugs;
    }
}
