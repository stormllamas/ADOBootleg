package com.example.adobootleg.rest;

public class SprintAPIResponse {

    private String name;
    private int toalStoryPoints;

    public SprintAPIResponse() {
    }

    public SprintAPIResponse(String name, int toalStoryPoints) {
        this.name = name;
        this.toalStoryPoints = toalStoryPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getToalStoryPoints() {
        return toalStoryPoints;
    }

    public void setToalStoryPoints(int toalStoryPoints) {
        this.toalStoryPoints = toalStoryPoints;
    }
}
