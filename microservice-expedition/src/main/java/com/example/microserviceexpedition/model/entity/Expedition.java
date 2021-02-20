package com.example.microserviceexpedition.model.entity;

import jdk.jfr.Enabled;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Enabled
public class Expedition {

    @Id
    @GeneratedValue
    public Long id;
    public Long commandId;
    public String state;
}
