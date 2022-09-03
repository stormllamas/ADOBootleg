package com.example.adobootleg.rest.adapters;

import com.example.adobootleg.rest.BugGetResponse;
import com.example.adobootleg.services.domain.Bug;
import org.springframework.stereotype.Service;

@Service
public class BugApiRequestAdapter {

    public Bug toBug(BugGetResponse request) {
        return new Bug(
            request.getId(),
            request.getName(),
            request.getDescription(),
            request.getPriority()
        );
    }

    public BugGetResponse toBugApiResponse(Bug request) {
        return new BugGetResponse(
            request.getId(),
            request.getName(),
            request.getDescription(),
            request.getPriority()
        );
    }

}
