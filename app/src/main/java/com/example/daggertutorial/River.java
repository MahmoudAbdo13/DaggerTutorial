package com.example.daggertutorial;


import javax.inject.Inject;

public class River {
    @Inject
    public River() {
    }

    public String getWater(){
        return "Water";
    }
}
