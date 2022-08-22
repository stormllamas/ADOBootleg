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
    public SprintSaveResponse saveSprint(@RequestBody SprintSaveRequest saveRequest) {

        Sprint sprintToSave = adapter.saveRequesttoSprintDomain(saveRequest);

        Sprint savedSprint = sprintService.save(sprintToSave);

        return adapter.sprintToSprintSaveResponse(savedSprint);
    }

}
