package com.example.adobootleg.services.domain;

public class Bug extends TaskItem {

    private int priority;

    private Story story;

    public Bug(String name, String description, Sprint sprint, int priority, Story story) {
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

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}
