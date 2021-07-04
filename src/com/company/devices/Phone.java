package com.company.devices;

import com.company.creatures.Human;
import com.company.Sellable.Sellable;
import java.util.ArrayList;

public class Phone extends Devices implements Rechargeable, Sellable {

    Double screenSize;
    String os;
    static final String defaultSeverIP = null;

    public Phone(String model, String producer, Integer yearOfProductions) {
        super(model, producer, yearOfProductions);
    }

    public void installAnApp(String appName){

        System.out.println("Zainstalowano apkę " + appName);

    }
    public void installAnApp(String appName, String appVersion){
        System.out.println("Zainstalowano apkę " + appName + " wersja " + appVersion);
    }

    public void installAnApp(String appName, String appVersion, String iP){
        System.out.println("Zainstalowano apkę " + appName + " wersja " + appVersion + " z serwera " + iP);

    }

    public void installAnApp(ArrayList<String> appNames){
        System.out.println("Lista zainstalowanych apek: ");
       // for ( int i = 0; i < appNames.length; i++)
        {System.out.println(appNames);

        }

    }

    public void installAnApp(URL url){

        System.out.println("Apka " + url + " została zainstalowana");

    }
    @Override
    public void turnOn() {
        System.out.println("stuknij w szybkę może zadziała");
    }

    @Override
    public void recharge()
    {System.out.println("ładuje se");}

    @Override
    public void rechargeFull()
    {System.out.println("ładuje se na full");}

    @Override
    public Double getBatteryLevel()
    {return 0.1;}

    @java.lang.Override
    public void feed() {

    }

    @java.lang.Override
    public void feed(Double foodWeight) {

    }

    // public String toString(){
   //     return producer+" "+model+" "+screenSize+" "+os;
   // }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != null && buyer.cash >= price)
        {
            buyer.phone= seller.phone;
            seller.phone = null;
            buyer.cash = buyer.cash - price;
            if (seller.cash == null)
            {seller.cash = 0.0;}
            seller.cash = seller.cash + price;
            System.out.println("Od teraz " + buyer.phone + " należy do " + buyer.firstName +
                    ".\nGotówka po transakcji kupującego: " + buyer.cash +
                    "\nGotówka po transakcji sprzedającego: " + seller.cash);
        }
        else
        {System.out.println("Transakcja nie udana.");}
    }



}
