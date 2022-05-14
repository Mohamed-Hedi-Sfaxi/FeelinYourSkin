package com.example.skincareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class FemaleSkinActivity extends AppCompatActivity {

    MaterialButton Oily,Dry,Mixed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_skin);

        Oily = findViewById(R.id.OilyBtn);
        Dry = findViewById(R.id.DryBtn);
        Mixed = findViewById(R.id.MixedBtn);

        Oily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GlobalVariables.RoutineType.equals("RoutineTypeDay")) {
                    Intent intent = new Intent(FemaleSkinActivity.this , DayOilyActivity.class);
                    startActivity(intent);
                } else if (GlobalVariables.RoutineType.equals("RoutineTypeNight")) {
                    Intent intent = new Intent(FemaleSkinActivity.this , NightOilyActivity.class);
                    startActivity(intent);
                }
            }
        });

        Dry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GlobalVariables.RoutineType.equals("RoutineTypeDay")) {
                    Intent intent = new Intent(FemaleSkinActivity.this , DayDryActivity.class);
                    startActivity(intent);
                } else if (GlobalVariables.RoutineType.equals("RoutineTypeNight")) {
                    Intent intent = new Intent(FemaleSkinActivity.this , NightDryActivity.class);
                    startActivity(intent);
                }
            }
        });

        Mixed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GlobalVariables.RoutineType.equals("RoutineTypeDay")) {
                    Intent intent = new Intent(FemaleSkinActivity.this , DayMixedActivity.class);
                    startActivity(intent);
                } else if (GlobalVariables.RoutineType.equals("RoutineTypeNight")) {
                    Intent intent = new Intent(FemaleSkinActivity.this , NightMixedActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}