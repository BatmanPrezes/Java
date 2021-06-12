package com.company.devices;

public class Devices {
    public final String producer;
    public final String model;

    public final Integer yearOfProductions;

    public Devices(String model, String producer,Integer yearOfProductions) {
        this.model = model;
        this.producer = producer;
        this.yearOfProductions = yearOfProductions;
    }

    public String toString(){
        return producer+" "+model+" "+yearOfProductions;

}}
