package com.example.adobootleg.rest.adapters;

import com.example.adobootleg.repository.SprintEntity;
import com.example.adobootleg.rest.SprintAPIResponse;
import com.example.adobootleg.rest.SprintSaveRequest;
import com.example.adobootleg.rest.SprintSaveResponse;
import com.example.adobootleg.services.domain.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class SprintRestResponseAdapter {

    @Autowired
    private StoryApiRequestAdapter storyApiRequestAdapter;

    public SprintAPIResponse toRestResponse(Sprint domain) {
        return new SprintAPIResponse(domain.getId(), domain.getName(), domain.getCreationDate());
    }

    public SprintSaveResponse sprintToSprintSaveResponse(Sprint domain) {
        return new SprintSaveResponse(domain.getId(), domain.getName(), domain.getCreationDate(),
                domain.getStories().stream().map(storyDomain -> storyApiRequestAdapter.toStoryApiResponse(storyDomain)).collect(Collectors.toList()));
    }

    public Sprint saveRequesttoSprintDomain(SprintSaveRequest request) {
        return new Sprint(request.getId(), request.getName(), request.getCreationDate(),
                request.getStories().stream().map(storyAPI -> storyApiRequestAdapter.toStory(storyAPI)).collect(Collectors.toList()));
    }

}
