package com.company.devices;

public class Car extends Devices{

    public String color;
    public Double value;

    public Car(String model, String producer, Integer yearOfProductions) {
        super(model, producer, yearOfProductions);
    }


    public Car(String model, String producer, Integer yearOfProductions, String color,Double value) {
        super(model, producer, yearOfProductions);
        this.color = color;
        this.value=value;
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

