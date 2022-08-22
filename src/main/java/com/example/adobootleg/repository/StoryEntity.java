package com.example.adobootleg.repository;

import javax.persistence.*;
import java.util.List;

@Entity
public class StoryEntity  {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private float points;

    public StoryEntity() {
    }

    public StoryEntity(Long id, String name, String description, float points) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.points = points;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }
}
