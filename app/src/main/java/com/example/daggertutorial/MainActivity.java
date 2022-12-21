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

        AppComponent component = ((MainApplication)getApplication()).getAppComponent();
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder().milk(4).sugar(3).appComponent(component).build();
        coffeeComponent.inject(this);

        Log.e(TAG, "onCreate: "+coffee.getCoffeeCup() + "\n " + coffee+ "\n " + coffee2);
        TextView textView = findViewById(R.id.coffee);
        textView.setText(coffee.getCoffeeCup());
    }
}