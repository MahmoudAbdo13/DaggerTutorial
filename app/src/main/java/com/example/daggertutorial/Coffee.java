package com.example.daggertutorial;

public class Coffee {
    private Farm farm;
    private River river;

    public Coffee(Farm farm, River river) {
        this.farm = farm;
        this.river = river;
    }
}
