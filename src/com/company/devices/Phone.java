package com.company.devices;

import com.company.Human;
import com.company.Sellable.Sellable;

public class Phone extends Devices implements Rechargeable, Sellable {

    Double screenSize;
    String os;

    public Phone(String model, String producer, Integer yearOfProductions) {
        super(model, producer, yearOfProductions);
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
