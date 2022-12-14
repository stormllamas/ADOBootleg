package com.example.adobootleg.repository;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class SprintEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "creation_date")
    private Date creationDate;

    @OneToMany(cascade = CascadeType.ALL)
    private List<StoryEntity> stories;

    public SprintEntity() {
    }

    public SprintEntity(Long id, String name, Date creationDate) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
    }

    public SprintEntity(Long id, String name, Date creationDate, List<StoryEntity> stories) {
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

    public List<StoryEntity> getStories() {
        return stories;
    }

    public void setStories(List<StoryEntity> stories) {
        this.stories = stories;
    }
}
