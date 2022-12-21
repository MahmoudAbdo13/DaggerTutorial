package com.example.daggertutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent component = DaggerCoffeeComponent.builder().
                coffeeModule(new CoffeeModule(3))
                .build();
        component.inject(this);

        Log.e(TAG, "onCreate: "+coffee.getCoffeeCup());
        TextView textView = findViewById(R.id.coffee);
        textView.setText(coffee.getCoffeeCup());
    }
}