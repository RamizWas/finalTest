package com.example.finaltest;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dinner extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView=(TextView) findViewById(R.id.dinner_meal_one);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
