package com.example.coacheck.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor @NoArgsConstructor @Data @Entity
public class mealsModel {

    @Id
    Integer id;
    String maelType;
    String exception;
    String mealGoal;
}
