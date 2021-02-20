package com.example.microserviceexpedition.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Expedition {

    @Id
    @GeneratedValue
    public Long id;
    public Long commandId;
    public String state;
}
