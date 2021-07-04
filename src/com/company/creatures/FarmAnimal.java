package com.company.creatures;

import com.company.creatures.Animal;

public class FarmAnimal extends Animal {
    public FarmAnimal(String species) {
        super(species);
    }


    @Override
    public void beEaten() {
        System.out.println("Próba zjedzenia tego maluszka się nie udała. Zostaw maluszka w spokoju");
    }
}