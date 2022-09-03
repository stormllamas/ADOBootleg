package com.example.adobootleg.repository;

import javax.persistence.*;

@Entity
public class TaskEntity extends TaskItemEntity {
    //    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    //    @JoinColumn(name = "story_id")
    //    private StoryEntity story;
    private Float hoursEstimate;
    private Float hoursRemaining;
    private Float hoursCompleted;

    public TaskEntity() {
    }

    public TaskEntity(Long id, String name, String description, Float hoursEstimate, Float hoursRemaining, Float hoursCompleted) {
        super(id, name, description);
        this.hoursEstimate = hoursEstimate;
        this.hoursRemaining = hoursRemaining;
        this.hoursCompleted = hoursCompleted;
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
