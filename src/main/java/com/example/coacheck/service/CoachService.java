package com.example.coacheck.service;


import com.example.coacheck.model.CoachModel;
import com.example.coacheck.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CoachService {

    //private ArrayList<CoachModel> coach = new ArrayList<>();
    private final CoachRepository coachRepository;

    @Autowired
    public CoachService(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }
// methods
}
