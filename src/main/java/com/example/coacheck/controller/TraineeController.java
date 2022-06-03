package com.example.coacheck.controller;


import com.example.coacheck.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/trainee")
public class TraineeController {

    private final TraineeService traineeService;

    @Autowired
    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    /**
     * get trainee model
     * put trainee model
     * update trainee
     * delete
     * */

//    @GetMapping
//    public List<TraineeModel> getTrainee(){
//
//        return List.of()
//    }




}
