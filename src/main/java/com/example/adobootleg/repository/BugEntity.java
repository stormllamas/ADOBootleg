package com.example.adobootleg.repository;

import javax.persistence.*;

@Entity
@Table(name="ADObootleg")
public class BugEntity extends TaskItemEntity {

    @Column(name="priority")
    private int priority;

    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "story_id")
    private StoryEntity story;

    public BugEntity(String name, String description, SprintEntity sprint, int priority, StoryEntity story) {
        super(name, description, sprint);
        this.priority = priority;
        this.story = story;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public StoryEntity getStory() {
        return story;
    }

    public void setStory(StoryEntity story) {
        this.story = story;
    }
}
