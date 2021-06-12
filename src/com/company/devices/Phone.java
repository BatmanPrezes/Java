package com.company.devices;

public class Phone {
    String producer;
    String model;
    Double screenSize;
    String os;

    public Phone (String producer,
            String model,
            Double screenSize,
            String os) {
        this.model = model;
        this.producer = producer;
        this.screenSize = screenSize;
        this.os = os;
    }

    public String toString(){
        return producer+" "+model+" "+screenSize+" "+os;
    }
}
