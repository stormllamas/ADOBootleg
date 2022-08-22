package com.example.adobootleg.services.domain;

import java.util.Date;
import java.util.List;

public class Sprint {
    private Integer id;

    private String name;

    private Date creationDate;

    private List<Story> stories;

    public Sprint(Integer id, String name, Date creationDate) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
    }

    public Sprint(Integer id, String name, Date creationDate, List<Story> stories) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.stories = stories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

//    public List<Task> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List<Task> tasks) {
//        this.tasks = tasks;
//    }
//
//    public List<Bug> getBugs() {
//        return bugs;
//    }
//
//    public void setBugs(List<Bug> bugs) {
//        this.bugs = bugs;
//    }
//
    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }
}
