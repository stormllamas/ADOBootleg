package com.example.adobootleg.rest;

public class StoryAPI {

    private Long id;
    private String name;
    private String description;
    private Float points;

    public StoryAPI() {
    }

    public StoryAPI(Long id, String name, String description, Float points) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.points = points;
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
}
