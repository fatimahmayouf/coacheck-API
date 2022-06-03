package com.example.coacheck.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor @NoArgsConstructor @Data @Entity
public class CoachModel {
    @Id
    Integer id;
    String name;
    String aboutHim;
    String email;
}
