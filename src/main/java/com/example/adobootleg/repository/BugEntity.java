package com.example.adobootleg.repository;

import javax.persistence.*;

@Entity
public class BugEntity extends TaskItemEntity {
    @Column(name="priority")
    private int priority;

//    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
//    @JoinColumn(name = "story_id")
//    private StoryEntity story;


    public BugEntity() {
    }

    public BugEntity(Long id, String name, String description, int priority) {
        super(id, name, description);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
