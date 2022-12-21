package com.example.daggertutorial;

import dagger.Component;

@Component
public interface CoffeeComponent {
    Coffee getCoffee();
}
