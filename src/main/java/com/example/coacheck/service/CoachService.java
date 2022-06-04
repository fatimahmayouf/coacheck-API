package com.example.coacheck.service;


import com.example.coacheck.model.CoachModel;
import com.example.coacheck.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoachService {

    //private ArrayList<CoachModel> coach = new ArrayList<>();
    private final CoachRepository coachRepository;

    @Autowired
    public CoachService(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }
// methods


    //get all coaches
    public List<CoachModel> getCoach(){
        return coachRepository.findAll();
    }

    // get coach by id
    public  CoachModel getMyCoach(Integer id){
        return coachRepository.getById(id);
    }

    // add coach
    public void addCoach(CoachModel coachModel){
        coachRepository.save(coachModel);
    }


    // delete coach
    public void deleteCoach(Integer id){
        coachRepository.deleteById(id);
    }

    // update coach
    public void updateCoach(Integer id, CoachModel coachModel){
    }

}
