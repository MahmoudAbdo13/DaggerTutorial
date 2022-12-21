package com.example.daggertutorial;


import android.util.Log;

import javax.inject.Inject;

public class River {

    private static final String TAG = "River";

    @Inject
    public River() {
        Log.e(TAG, "River: ");
    }

    public String getWater(){
        return "Water";
    }
}
