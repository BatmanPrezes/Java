package com.company.devices;
import com.company.creatures.Human;

abstract  public class Devices {
    public final String producer;
    public final String model;

    public final Integer yearOfProductions;

    public Devices(String model, String producer,Integer yearOfProductions) {
        this.model = model;
        this.producer = producer;
        this.yearOfProductions = yearOfProductions;
    }

    abstract public void turnOn();

    public abstract void sell(Human seller, Human buyer, Double price);

    public String toString(){
        return producer+" "+model+" "+yearOfProductions;

}}
