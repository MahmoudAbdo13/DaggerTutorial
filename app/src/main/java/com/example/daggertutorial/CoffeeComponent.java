package com.example.daggertutorial;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder sugar(@Named("sugar") int sugar);

        @BindsInstance
        Builder milk(@Named("milk") int milk);

        CoffeeComponent build();
    }
}
