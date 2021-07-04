package com.company;

import com.company.creatures.FarmAnimal;
import com.company.devices.Devices;
import com.company.devices.Phone;
import com.company.devices.Car;
import com.company.devices.Devices;
import com.company.creatures.Human;
import com.company.creatures.Animal;

public class Main {


    public static void main(String[] args) {
        Animal dog = new Animal("canis familiaris") {
            @java.lang.Override
            public void beEaten() {

            }
        };

        FarmAnimal pig = new FarmAnimal("świnia");
        pig.beEaten();
        dog.name = "Bigosowa";
        //dog.weight = 12.0;
       // dog.species = "canis familiaris";

        System.out.println(dog.name);
        System.out.println(dog.species);

        dog.printName();
        dog.printNameAndOwner("Daria");

        String text = dog.getNameAndOwner("Daria");
        System.out.println(text);

        Human daria = new Human();
        daria.pet = dog;
        daria.firstName = "Daria";
        daria.lastName = "Cesarzowa";
        System.out.println(daria.pet);
        Human maria = new Human();
        maria.firstName ="Maria";
        maria.cash = 78.0;

        dog.sell(daria, maria, 50.0);

        //Car auto = new Car("93","Sab Auto Mobile",1996);
        //auto.color = "Pink";
        //.value = 6322345.02;

        //daria.car = auto;

        //auto.sell(daria, maria, 777.0);

        //maria.cash = 7777.0;

        //auto.sell(daria, maria, 777.0);

        //Phone phone1 = new Phone("samsung","a34",1999);

        //phone1.sell(daria, maria, 777.0);

        //daria.phone = phone1;
        //phone1.sell(daria, maria, 777.0);

        //daria.sell(daria, maria, 777.0); <--- no nie mogę sprzedać sama siebie bo w human nie ma tej metody xd

        dog.feed(680.77);
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        //System.out.println(daria.pet.species);


        //Car auto2 = new Car("93","Sab Auto Mobile",1996);
        //auto2.color = "Pink";
        //auto2.value = 6322345.02;


       //daria.setSalary(44.0);
        //daria.setSalary(-10.0);
        //daria.setSalary(2000.0);

        //daria.setSalary(144.0);

       //daria.setSalary(4424.0);

        //daria.setCar(auto);

        //daria.setSalary(536862.0);

        //daria.setCar(auto);

       // daria.setSalary(6666666666666.0);

       // daria.setCar(auto);

       //System.out.println("Obecnie mam: " + daria.getSalary() +" hajsu\n");

       //porównywanie
       // System.out.println("Czy są takie same:");
        //System.out.println(auto
        //        .equals(auto2));

        //System.out.println(daria);
        //System.out.println(auto);
       // System.out.println(dog);


        //Phone phone1 = new Phone("samsung","a34",16.0,"ddd");

        //System.out.println(phone1);

        //Devices fridge = new Devices("szajsung","blablabla",2333);



    }
}
