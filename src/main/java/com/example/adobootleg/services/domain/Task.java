package com.example.adobootleg.services.domain;

public class Task extends TaskItem {
    private Float hoursEstimate;
    private Float hoursRemaining;
    private Float hoursCompleted;

    public Task(Long id, String name, String description) {
        super(id, name, description);
    }

    public Task(Long id, String name, String description, float hoursEstimate, float hoursRemaining, float hoursCompleted) {
        super(id, name, description);
        this.hoursEstimate = hoursEstimate;
        this.hoursRemaining = hoursRemaining;
        this.hoursCompleted = hoursCompleted;
    }

    public float getHoursEstimate() {
        return hoursEstimate;
    }

    public void setHoursEstimate(float hoursEstimate) {
        this.hoursEstimate = hoursEstimate;
    }

    public float getHoursRemaining() {
        return hoursRemaining;
    }

    public void setHoursRemaining(float hoursRemaining) {
        this.hoursRemaining = hoursRemaining;
    }

    public float getHoursCompleted() {
        return hoursCompleted;
    }

    public void setHoursCompleted(float hoursCompleted) {
        this.hoursCompleted = hoursCompleted;
    }
}
