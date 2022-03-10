package com.example.androidfamiliaritywiththeplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonSwitch1);

        button.setOnClickListener(v ->
        {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });

        Button buttonCalc = findViewById(R.id.buttonCalc);

        buttonCalc.setOnClickListener(v ->
        {
            Intent intent = new Intent(MainActivity.this, Calculator.class);
            startActivity(intent);
        });

    }

    public void ButtonClick_switch1(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    public void ButtonClick_calc(View view) {
        Intent intent = new Intent(MainActivity.this, Calculator.class);
        startActivity(intent);
    }

}