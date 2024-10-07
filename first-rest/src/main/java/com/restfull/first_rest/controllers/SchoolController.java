package com.restfull.first_rest.controllers;

import com.restfull.first_rest.dtos.SchoolDto;
import com.restfull.first_rest.entities.School;
import com.restfull.first_rest.services.SchoolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/v1/save-school")
    public SchoolDto saveSchool(@RequestBody School school) {
        return this.schoolService.saveSchool(school);
    }

    @GetMapping("/v1/get-school")
    public List<SchoolDto> getAllSchool() {
        return this.schoolService.getAllSchool();
    }
}
