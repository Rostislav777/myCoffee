package com.example.com.coffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
static int quantity = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){
        quantity = quantity + 1;

    }
    public void decrement(View view){
        quantity = quantity - 1;

    }
}
