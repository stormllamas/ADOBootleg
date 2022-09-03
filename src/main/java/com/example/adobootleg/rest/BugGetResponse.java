package com.example.adobootleg.rest;

public class BugGetResponse {
    private Long id;
    private String name;
    private String description;
    private int priority;

    public BugGetResponse() {
    }

    public BugGetResponse(Long id, String name, String description, int priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priority = priority;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
