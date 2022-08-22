package com.example.adobootleg.services.domain;

import java.util.List;

public class Story extends TaskItem {
    private float points;


    public Story(Long id, String name, String description, float points
    ) {
        super(id, name, description);
        this.points = points;

    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

//    public List<Task> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List<Task> tasks) {
//        this.tasks = tasks;
//    }
}
