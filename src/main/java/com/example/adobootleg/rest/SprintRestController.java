package com.example.adobootleg.rest;

import com.example.adobootleg.rest.adapters.QueryParamToSortAdapter;
import com.example.adobootleg.rest.adapters.SprintRestResponseAdapter;
import com.example.adobootleg.services.SprintService;
import com.example.adobootleg.services.domain.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/sprints")
public class SprintRestController {
    @Autowired
    private QueryParamToSortAdapter queryAdapter;

    @Autowired
    private SprintService sprintService;

    @Autowired
    private SprintRestResponseAdapter adapter;

    @GetMapping
    public List<SprintSimpleGetResponse> getSprints(@RequestParam(required = false) String orderSprintsBy) {
        if (orderSprintsBy != null && (orderSprintsBy.contains("CreationDate") || orderSprintsBy.contains("Name"))) {
            Sort sort = queryAdapter.toSort(orderSprintsBy);
            return sprintService.findAll(sort).stream().map(domain -> adapter.toSimpleRestResponse(domain)).collect(Collectors.toList());
        } else {
            return sprintService.findAll().stream().map(domain -> adapter.toSimpleRestResponse(domain)).collect(Collectors.toList());
        }
    }

    @GetMapping("/{sprintId}")
    public SprintGetResponse getSprint(@PathVariable Long sprintId) {
        return adapter.toRestResponse(sprintService.findById(sprintId));
    }

    @PostMapping
    public SprintSaveResponse saveSprint(@RequestBody SprintSaveRequest saveRequest) {

        Sprint sprintToSave = adapter.saveRequestToSprintDomain(saveRequest);

        Sprint savedSprint = sprintService.save(sprintToSave);

        return adapter.sprintToSprintSaveResponse(savedSprint);
    }

}
