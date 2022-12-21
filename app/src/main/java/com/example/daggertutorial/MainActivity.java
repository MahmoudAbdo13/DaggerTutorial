package com.example.daggertutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent component = ((MainApplication)getApplication()).getCoffeeComponent();
        component.inject(this);

        Log.e(TAG, "onCreate: "+coffee.getCoffeeCup());
        Log.e(TAG, "onCreate: "+coffee2.getCoffeeCup());
        TextView textView = findViewById(R.id.coffee);
        textView.setText(coffee.getCoffeeCup());
    }
}