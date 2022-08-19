package com.example.adobootleg.repository;

import javax.persistence.*;

@Entity
@Table(name="ADObootleg")
public class TaskEntity extends TaskItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "story_id")
    private StoryEntity story;

    public TaskEntity(int id, String name, String description, SprintEntity sprint, StoryEntity story) {
        super(name, description, sprint);
        this.id = id;
        this.story = story;
    }

    public StoryEntity getStory() {
        return story;
    }

    public void setStory(StoryEntity story) {
        this.story = story;
    }
}
