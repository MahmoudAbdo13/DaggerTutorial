package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {

    private static final String TAG = "CoffeeModule";

    @Singleton
    @Provides
    River provideRiver(){
        Log.e(TAG, "provideRiver: ");
        return new River();
    }
}
