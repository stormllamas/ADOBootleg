package com.example.adobootleg.services.domain;

public class TaskItem {
    private int id;

    private String name;

    private String description;

    private Sprint sprint;

    public TaskItem(String name, String description, Sprint sprint) {
        this.name = name;
        this.description = description;
        this.sprint = sprint;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }
}
