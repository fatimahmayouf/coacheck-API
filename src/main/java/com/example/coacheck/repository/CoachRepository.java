package com.example.coacheck.repository;

import com.example.coacheck.model.CoachModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends JpaRepository<CoachModel,Integer> {
}
