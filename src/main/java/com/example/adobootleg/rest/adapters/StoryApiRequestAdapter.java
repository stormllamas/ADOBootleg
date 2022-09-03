package com.example.adobootleg.rest.adapters;

import com.example.adobootleg.rest.StoryGetResponse;
import com.example.adobootleg.services.domain.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class StoryApiRequestAdapter {

    @Autowired
    private TaskApiRequestAdapter taskApiRequestAdapter;
    @Autowired
    private BugApiRequestAdapter bugApiRequestAdapter;

    public Story toStory(StoryGetResponse request) {
        return new Story(
            request.getId(),
            request.getName(),
            request.getDescription(),
            request.getPoints(),
            request.getTasks().stream().map(task -> taskApiRequestAdapter.toTask(task)).collect(Collectors.toList()),
            request.getBugs().stream().map(bug -> bugApiRequestAdapter.toBug(bug)).collect(Collectors.toList())
        );
    }

    public StoryGetResponse toStoryApiResponse(Story request) {
        return new StoryGetResponse(
            request.getId(),
            request.getName(),
            request.getDescription(),
            request.getPoints(),
            request.getTasks().stream().map(task -> taskApiRequestAdapter.toTaskApiResponse(task)).collect(Collectors.toList()),
            request.getBugs().stream().map(bug -> bugApiRequestAdapter.toBugApiResponse(bug)).collect(Collectors.toList())
        );
    }

}
