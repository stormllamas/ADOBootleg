package com.example.adobootleg.rest;

import java.util.Date;
import java.util.List;

public class SprintSaveRequest {
    private Long id;
    private String name;
    private Date creationDate;
    private List<StoryGetResponse> stories;


    public SprintSaveRequest() {
    }

    public SprintSaveRequest(Long id, String name, Date creationDate) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
    }

    public SprintSaveRequest(Long id, String name, Date creationDate, List<StoryGetResponse> stories) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.stories = stories;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<StoryGetResponse> getStories() {
        return stories;
    }

    public void setStories(List<StoryGetResponse> stories) {
        this.stories = stories;
    }
}
