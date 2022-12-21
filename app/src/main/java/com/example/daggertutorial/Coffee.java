package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Coffee {

    private static final String TAG = "Coffee";

    @Inject
    Farm farm;

    River river;
    int sugar;
    int milk;

    @Inject
    public Coffee(River river, @Sugar int sugar, @Milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
        Log.e(TAG, "Coffee: ");
    }

    @Inject
    public void connectElectricity(){
        Log.e(TAG, "connectElectricity: Connect...");
    }

    public String getCoffeeCup(){
        return "CoffeeCup is content of " + river.getWater() + " + " + farm.getCoffeeBeans()+
                ", need Sugar: "+ sugar +" and need milk: "+ milk+ "farm number: "+ farm;
    }
}
