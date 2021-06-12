package com.company.devices;

public class Phone extends Devices{

    Double screenSize;
    String os;

    public Phone(String model, String producer, Integer yearOfProductions) {
        super(model, producer, yearOfProductions);
    }

    @java.lang.Override
    public void turnOn() {
        System.out.println("stuknij w szybkę może zadziała");
    }


    // public String toString(){
   //     return producer+" "+model+" "+screenSize+" "+os;
   // }
}
