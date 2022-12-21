package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class Farm {

    private static final String TAG = "Farm";

    @Inject
    public Farm() {
        Log.e(TAG, "Farm: ");
    }

    public String getCoffeeBeans(){
        return "CoffeeBeans";
    }
}
