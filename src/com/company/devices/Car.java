package com.company.devices;

import com.company.creatures.Human;
import com.company.Sellable.Sellable;

public abstract class Car extends Devices implements Sellable {

    public String color;
    public Double value;

    public Car(String model, String producer, Integer yearOfProductions) {
        super(model, producer, yearOfProductions);
    }

    @Override
    public void turnOn() {
        System.out.println("kopnij silnik aż zaskoczy");
    }


    public Car(String model, String producer, Integer yearOfProductions, String color,Double value) {
        super(model, producer, yearOfProductions);
        this.color = color;
        this.value=value;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.car != null && buyer.cash >= price)
        {
            buyer.car = seller.car;
            seller.car = null;
            buyer.cash = buyer.cash - price;
            if (seller.cash == null)
            {seller.cash = 0.0;}
            seller.cash = seller.cash + price;
            System.out.println("Od teraz " + buyer.car + " należy do " + buyer.firstName +
                    ".\nGotówka po transakcji kupującego: " + buyer.cash +
                    "\nGotówka po transakcji sprzedającego: " + seller.cash);
        }
        else
        {System.out.println("Transakcja nie udana.");}
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

