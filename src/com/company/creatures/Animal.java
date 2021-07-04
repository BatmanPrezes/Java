package com.company.creatures;

import com.company.Sellable.Sellable;

public abstract class Animal implements Sellable {
    final public String species;
    public String name;
    private Double weight;


    //konstruktor
    public Animal(String species) {
        this.species = species;
        if (this.species == "syrenka") {
            this.weight = 50.0;
        } else if (this.species == "koza") {
            this.weight = 25.0;
        } else if (this.species == "koczkodan") {
            this.weight = 44.0;
        } else if (this.species == "myszojelen") {
            this.weight = 11.0;
        } else {
            this.weight = 5.0;
        }
    }

    public void printName() {
        System.out.println("my name is: " + this.name);
    }

    public void printNameAndOwner(String owner) {
        System.out.println(owner + " has " + this.name);
    }

    @Override
    public void feed() {
        if (this.weight > 0) {
            this.weight += 1;
            System.out.println("Omnomnom. +1 do brzuszka (" + this.weight + ")");
        } else {
            System.out.println("Tera to już za późno na to >:( ");
        }
    }

    public void takeForAWalk() {
        if (this.weight > 0) {
            this.weight -= 1;
            if (this.weight == 0) {
                System.out.println("Wykończyłeś " + this.name + " :(");
            } else {
                System.out.println("Tuptuptup. -1 do brzuszka (" + this.weight + ")");
            }
        } else {
            System.out.println("Nie możesz wyprowadzić zwłok X_X");

        }


    }

    public Double getWeight() {
        return this.weight;
    }

    public String getNameAndOwner(String owner) {
        return owner + " has " + this.name;
    }


    public String toString(){
        return species+" "+weight+" "+name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
       if (seller.pet != null && buyer.cash >= price)
        {
            buyer.pet = seller.pet;
            seller.pet = null;
            buyer.cash = buyer.cash - price;
            if (seller.cash == null)
            {seller.cash = 0.0;}
            seller.cash = seller.cash + price;
            System.out.println("Od teraz " + buyer.pet.name + " należy do " + buyer.firstName +
                               ".\nGotówka po transakcji kupującego: " + buyer.cash +
                               "\nGotówka po transakcji sprzedającego: " + seller.cash);
        }
        else
        {System.out.println("Transakcja nie udana.");}
    }


    @Override
    public void feed(Double foodWeight) {
        System.out.println("Właśnie nakarmiłeś pupila karmą o wadzę: " + foodWeight);
    }
    public abstract void beEaten();
}
