package com.example.adobootleg.rest.adapters;

import com.example.adobootleg.rest.StoryGetResponse;
import com.example.adobootleg.rest.TaskGetResponse;
import com.example.adobootleg.services.domain.Story;
import com.example.adobootleg.services.domain.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskApiRequestAdapter {

    public Task toTask(TaskGetResponse request) {
        return new Task(
            request.getId(),
            request.getName(),
            request.getDescription(),
            request.getHoursEstimate(),
            request.getHoursRemaining(),
            request.getHoursCompleted()
        );
    }

    public TaskGetResponse toTaskApiResponse(Task request) {
        return new TaskGetResponse(
            request.getId(),
            request.getName(),
            request.getDescription(),
            request.getHoursEstimate(),
            request.getHoursRemaining(),
            request.getHoursCompleted()
        );
    }

}
