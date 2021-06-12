package com.company;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;

    // Getter
    public Double getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(Double newSalary) {

        if(newSalary>=0) {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println(formatter.format(date) + " zmiana ceny:\nPrzed: " + this.salary + "\nPo: " + newSalary + "\n");
        System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
        System.out.println("Konieczne jest odebranie aneksu do umowy od pani Hani z kadr do tygodnia od daty zmiany wartości wpłaty.");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu.\n");

        this.salary = newSalary;}

        else {System.out.println("Wartość wypłaty nie może być ujemna\n");}
    }

    // Getter
    public Car getCar() {
        return car;
    }

    // Setter
    public void setCar(Car newCar) {

        if(newCar.value<this.salary) {
            System.out.println("Udało Ci się zakupić auto producenta " + newCar.producer +  "\n");
            this.car= newCar;}
        else if((newCar.value/12)<this.salary)
        {
            System.out.println("Udało Ci się zakupić auto producenta " + newCar.producer + " na kredyt\n");
            this.car= newCar;}

        else {System.out.println("Zainwestuj w botcoina póki jest obniżka\n");}
    }
}


