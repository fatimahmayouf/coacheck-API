package com.example.coacheck.service;


import com.example.coacheck.model.TraineeModel;
import com.example.coacheck.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TraineeService {

    private final TraineeRepository traineeRepository;

    //private ArrayList<TraineeModel> trainee= new ArrayList<>();
    @Autowired
    public TraineeService(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    //get

    public List<TraineeModel> getTrainee(){
        return traineeRepository.findAll();
    }

    // add
    public void addTrainee(TraineeModel trainee){
        traineeRepository.save(trainee);
    }

    // get one trainee
    public TraineeModel getOneTrainee(Integer id){
       return traineeRepository.getById(id);
    }

    // delete one trainee
    public void deleteTrainee(Integer id){
        traineeRepository.deleteById(id);
    }

    // update trainee

}
