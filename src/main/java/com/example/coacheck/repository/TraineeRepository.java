package com.example.coacheck.repository;

import com.example.coacheck.model.TraineeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraineeRepository extends JpaRepository<TraineeModel,Integer> {
}
