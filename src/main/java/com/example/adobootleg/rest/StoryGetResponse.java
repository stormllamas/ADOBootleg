package com.example.adobootleg.rest;

import java.util.List;

public class StoryGetResponse {

    private Long id;
    private String name;
    private String description;
    private Float points;
    private List<TaskGetResponse> tasks;
    private List<BugGetResponse> bugs;

    public StoryGetResponse(Long id, String name, String description, Float points, List<TaskGetResponse> tasks, List<BugGetResponse> bugs) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.points = points;
        this.tasks = tasks;
        this.bugs = bugs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPoints() {
        return points;
    }

    public void setPoints(Float points) {
        this.points = points;
    }

    public List<TaskGetResponse> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskGetResponse> tasks) {
        this.tasks = tasks;
    }

    public List<BugGetResponse> getBugs() {
        return bugs;
    }

    public void setBugs(List<BugGetResponse> bugs) {
        this.bugs = bugs;
    }
}
