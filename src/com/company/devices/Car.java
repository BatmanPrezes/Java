package com.company.devices;

public class Car {

    final public String model;
    final public String producer;
    public String color;
    public Double value;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car car = (Car) o;
            if (car.producer.equals(this.producer)
                    && car.model.equals(this.model)
                    && car.color.equals(this.color)
                    && car.value == this.value)
                return true;
            else
                return false;

        }
        else return false;

        }


        public String toString () {
            return model + " " + producer + " " + color + " " + value;
        }

    }

