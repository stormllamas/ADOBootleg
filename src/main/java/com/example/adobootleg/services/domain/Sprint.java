package com.example.adobootleg.services.domain;

import java.util.Date;
import java.util.List;

public class Sprint {
    private int id;

    private String name;

    private Date creationDate;

    private List<Task> tasks;

    private List<Bug> bugs;

    private List<Story> stories;

    public Sprint(int id, String name, Date creationDate, List<Task> tasks, List<Bug> bugs, List<Story> stories) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.tasks = tasks;
        this.bugs = bugs;
        this.stories = stories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }
}
