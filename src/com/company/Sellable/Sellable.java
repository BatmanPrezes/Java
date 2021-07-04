package com.company.Sellable;

import com.company.creatures.Human;

public interface Sellable {
    void feed();

    public void sell(Human seller, Human buyer, Double price);

    void feed(Double foodWeight);
}
