package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {
    private static final String TAG = "Coffee";
    @Inject
    Farm farm;
    @Inject
    River river;


    @Inject
    public Coffee() {
    }

    @Inject
    public void connectElectricity(){
        Log.e(TAG, "connectElectricity: Connect...");
    }

    public String getCoffeeCup(){
        return "CoffeeCup is content of " + river.getWater() + " + " + farm.getCoffeeBeans();
    }
}
