package com.example.adobootleg.rest.adapters;

import com.example.adobootleg.repository.SprintEntity;
import com.example.adobootleg.rest.SprintAPIResponse;
import org.springframework.stereotype.Service;

@Service
public class SprintRestResponseAdapter {


   public SprintAPIResponse  toRestResponse(SprintEntity domain){

      return new SprintAPIResponse(domain.getName(), Integer.valueOf((int) domain.getStories().stream().map(story -> story.getPoints()).mapToDouble(s -> Double.valueOf(s)).sum()));


   }

}
