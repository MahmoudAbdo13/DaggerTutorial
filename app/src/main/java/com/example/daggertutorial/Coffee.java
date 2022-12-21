package com.example.daggertutorial;

import javax.inject.Inject;

public class Coffee {
    @Inject
    Farm farm;
    @Inject
    River river;

    @Inject
    public Coffee() {
    }

    public String getCoffeeCup(){
        return "CoffeeCup is content of " + river.getWater() + " + " + farm.getCoffeeBeans();
    }
}
