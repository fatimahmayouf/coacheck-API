package com.example.coacheck.controller;


import com.example.coacheck.model.CoachModel;
import com.example.coacheck.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/coach")
public class CoachController {

    private final CoachService coachService;

    @Autowired
    public CoachController(CoachService coachService) {
        this.coachService = coachService;
    }

    /**
     * Get coach model
     * put coach
     * update coach
     *
     * */


    @GetMapping
    public List<CoachModel> getCoach(){
        return coachService.getCoach();
    }
}
