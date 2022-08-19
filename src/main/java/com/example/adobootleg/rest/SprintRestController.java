package com.example.adobootleg.rest;

import com.example.adobootleg.repository.SprintEntity;
import com.example.adobootleg.rest.adapters.SprintRestResponseAdapter;
import com.example.adobootleg.services.SprintService;
import com.example.adobootleg.services.domain.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/sprints")
public class SprintRestController {
    @Autowired
    private SprintService sprintService;


    @Autowired
    private SprintRestResponseAdapter adapter;
    @GetMapping
    public List<SprintAPIResponse> getSprints() {
        return sprintService.findAll().stream().map(domain -> adapter.toRestResponse(domain)).collect(Collectors.toList());
    }

    @PostMapping
    public Sprint addSprint(@RequestBody SprintApiRequest sprint) {




        return sprintService.save(sprint);
    }

    @PutMapping
    public Sprint updateSprint(@RequestBody SprintEntity sprint) {
        return sprintService.save(sprint);
    }

    @DeleteMapping("/{sprintId}")
    public String updateSprint(@PathVariable int sprintId) {
        Sprint sprint = sprintService.findById(sprintId);
        if(sprint == null) {
            throw new RuntimeException("Sprint id not found - " + sprintId);
        }

        sprintService.deleteById(sprintId);
        return "Sprint with id " + sprint.getId() + " deleted";
    }

    @GetMapping("/{sprintId}")
    public Sprint getSprint(@PathVariable int sprintId) {
        return sprintService.findById(sprintId);
    }
}
