package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis familiaris");
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

        dog.feed();
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
        Car auto = new Car("93","Sab Auto Mobile");
        auto.color = "Pink";
        auto.value = 6322345.02;




       daria.setSalary(44.0);
        daria.setSalary(-10.0);
        daria.setSalary(2000.0);

        daria.setSalary(144.0);

       daria.setSalary(4424.0);

        daria.setCar(auto);

        daria.setSalary(536862.0);

        daria.setCar(auto);

       // daria.setSalary(6666666666666.0);

       // daria.setCar(auto);

       System.out.println("Obecnie mam: " + daria.getSalary() +" hajsu\n");




    }
}
