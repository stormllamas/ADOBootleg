package com.example.adobootleg.repository;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="ADObootleg")
public class SprintEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="creation_date")
    private Date creationDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "sprint_id")
    private List<TaskEntity> tasks;

    @OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "bug_id")
    private List<BugEntity> bugs;

    @OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "sprint_id")
    private List<StoryEntity> stories;

    public SprintEntity() {
    }

    public SprintEntity(int id, String name, Date creationDate, List<TaskEntity> tasks, List<BugEntity> bugs, List<StoryEntity> stories) {
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

    public List<TaskEntity> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskEntity> tasks) {
        this.tasks = tasks;
    }

    public List<BugEntity> getBugs() {
        return bugs;
    }

    public void setBugs(List<BugEntity> bugs) {
        this.bugs = bugs;
    }

    public List<StoryEntity> getStories() {
        return stories;
    }

    public void setStories(List<StoryEntity> stories) {
        this.stories = stories;
    }
}
