package com.example.adobootleg.rest;

import java.util.Date;
import java.util.List;

public class SprintSaveResponse {
    private Integer id;
    private String name;
    private Date creationDate;
    private List<StoryAPI> stories;


    public SprintSaveResponse() {
    }

    public SprintSaveResponse(Integer id, String name, Date creationDate) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
    }

    public SprintSaveResponse(Integer id, String name, Date creationDate, List<StoryAPI> stories) {
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

    public List<StoryAPI> getStories() {
        return stories;
    }

    public void setStories(List<StoryAPI> stories) {
        this.stories = stories;
    }
}
