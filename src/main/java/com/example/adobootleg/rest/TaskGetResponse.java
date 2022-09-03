package com.example.adobootleg.rest;

public class TaskGetResponse {
    private Long id;
    private String name;
    private String description;
    private Float hoursEstimate;
    private Float hoursRemaining;
    private Float hoursCompleted;

    public TaskGetResponse() {
    }

    public TaskGetResponse(Long id, String name, String description, Float hoursEstimate, Float hoursRemaining, Float hoursCompleted) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hoursEstimate = hoursEstimate;
        this.hoursRemaining = hoursRemaining;
        this.hoursCompleted = hoursCompleted;
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

    public Float getHoursEstimate() {
        return hoursEstimate;
    }

    public void setHoursEstimate(Float hoursEstimate) {
        this.hoursEstimate = hoursEstimate;
    }

    public Float getHoursRemaining() {
        return hoursRemaining;
    }

    public void setHoursRemaining(Float hoursRemaining) {
        this.hoursRemaining = hoursRemaining;
    }

    public Float getHoursCompleted() {
        return hoursCompleted;
    }

    public void setHoursCompleted(Float hoursCompleted) {
        this.hoursCompleted = hoursCompleted;
    }
}
