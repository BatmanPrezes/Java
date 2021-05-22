package com.company;

public class Animal {
    final public String species;
    private Double weight;
    String name;

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

    void printName() {
        System.out.println("my name is: " + this.name);
    }

    void printNameAndOwner(String owner) {
        System.out.println(owner + " has " + this.name);
    }

    void feed() {
        if (this.weight > 0) {
            this.weight += 1;
            System.out.println("Omnomnom. +1 do brzuszka (" + this.weight + ")");
        } else {
            System.out.println("Tera to już za późno na to >:( ");
        }
    }

    void takeForAWalk() {
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

    Double getWeight() {
        return this.weight;
    }

    String getNameAndOwner(String owner) {
        return owner + " has " + this.name;
    }
}
