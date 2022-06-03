package com.example.coacheck.service;


import com.example.coacheck.model.TraineeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TraineeService {

    private ArrayList<TraineeModel> trainee= new ArrayList<>();

    //get

    public ArrayList<TraineeModel> getTrainee(){
        return trainee;
    }

    // add
    public void addTrainee(TraineeModel trainee){

    }
}
