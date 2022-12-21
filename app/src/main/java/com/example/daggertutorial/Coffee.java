package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";

    @Inject
    Farm farm;

    River river;


    @Inject
    public Coffee(River river) {
        this.river = river;
        Log.e(TAG, "Coffee: ");
    }

    @Inject
    public void connectElectricity(){
        Log.e(TAG, "connectElectricity: Connect...");
    }

    public String getCoffeeCup(){
        return "CoffeeCup is content of " + river.getWater() + " + " + farm.getCoffeeBeans();
    }
}
