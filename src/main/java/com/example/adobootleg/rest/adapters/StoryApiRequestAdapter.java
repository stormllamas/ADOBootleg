package com.example.adobootleg.rest.adapters;

import com.example.adobootleg.rest.StoryAPI;
import com.example.adobootleg.services.domain.Story;
import org.springframework.stereotype.Service;

@Service
public class StoryApiRequestAdapter {

    public Story toStory(StoryAPI request) {
        return new Story(request.getId(), request.getName(), request.getDescription(), request.getPoints());
    }

    public StoryAPI toStoryApiResponse(Story request) {
        return new StoryAPI(request.getId(), request.getName(), request.getDescription(), request.getPoints());
    }

}
