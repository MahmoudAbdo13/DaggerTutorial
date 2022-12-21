package com.example.daggertutorial;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder sugar(int sugar);

        @BindsInstance
        Builder milk(int milk);

        CoffeeComponent build();
    }
}
