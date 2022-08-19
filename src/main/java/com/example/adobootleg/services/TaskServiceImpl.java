package com.example.adobootleg.services;

import com.example.adobootleg.services.domain.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private static List<Task> tasks = new ArrayList<>();

    public TaskServiceImpl() {
    }

    @Override
    public List<Task> findAll() {
        return tasks;
    }

    @Override
    public Task findById(int taskId) {
        for (Task task: tasks) {
            if (task.getId() == taskId) {
                return task;
            }
        }
        return null;
    }

    @Override
    public Task findByName(String taskName) {
        for (Task task: tasks) {
            if (task.getName() == taskName) {
                return task;
            }
        }
        return null;
    }

    @Override
    public Task save(Task task) {
        if(task != null) {
            if (task.getId() == -1 || task.getId() == 0) {
                tasks.add(task);
            } else {
                deleteById(task.getId());
                tasks.add(task);
            }
            return task;
        } else {
            return null;
        }
    }

    @Override
    public void deleteById(int taskId) {
        Task task = findById(taskId);

        if(task != null) {
            tasks.remove(task);
        }
    }
}
