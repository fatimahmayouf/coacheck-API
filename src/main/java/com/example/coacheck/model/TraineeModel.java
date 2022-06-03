package com.example.coacheck.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor @AllArgsConstructor @Data @Entity
public class TraineeModel {
    @Id
    Integer id;
    String name;
    Integer age;
    Float tall;
    Float weight;
    Integer lose;
    String diseases;
    String email;

}
