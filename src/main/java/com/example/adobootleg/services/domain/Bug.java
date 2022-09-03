package com.example.adobootleg.services.domain;

public class Bug extends TaskItem {
    private int priority;

    public Bug() {
    }

    public Bug(Long id, String name, String description, int priority) {
        super(id, name, description);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
