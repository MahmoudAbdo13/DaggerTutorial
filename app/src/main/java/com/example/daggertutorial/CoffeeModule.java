package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    private static final String TAG = "CoffeeModule";
    int sugar;

    public CoffeeModule(int sugar) {
        this.sugar = sugar;
    }

    @Provides
    River provideRiver(){
        Log.e(TAG, "provideRiver: ");
        return new River();
    }

    @Provides
    int provideSugar(){
        Log.e(TAG, "provideSugar: ");
        return sugar;
    }
}
