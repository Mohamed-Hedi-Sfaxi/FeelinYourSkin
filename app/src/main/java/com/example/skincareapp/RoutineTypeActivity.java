package com.example.skincareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class RoutineTypeActivity extends AppCompatActivity {

    MaterialButton Day,Night;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routinetype);

        Day = findViewById(R.id.DayBtn);
        Night = findViewById(R.id.NightBtn);

        Day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalVariables.RoutineType = "RoutineTypeDay";
                if (GlobalVariables.GenderType.equals("GenderTypeFemale")) {
                    Intent intent = new Intent(RoutineTypeActivity.this , FemaleSkinActivity.class);
                    startActivity(intent);
                } else if (GlobalVariables.GenderType.equals("GenderTypeMale")) {
                    Intent intent = new Intent(RoutineTypeActivity.this , MaleSkinActivity.class);
                    startActivity(intent);
                }
            }

        });

        Night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalVariables.RoutineType = "RoutineTypeNight";
                if (GlobalVariables.GenderType.equals("GenderTypeFemale")) {
                    Intent intent = new Intent(RoutineTypeActivity.this , FemaleSkinActivity.class);
                    startActivity(intent);
                } else if (GlobalVariables.GenderType.equals("GenderTypeMale")) {
                    Intent intent = new Intent(RoutineTypeActivity.this , MaleSkinActivity.class);
                    startActivity(intent);
                }

            }

        });


    }
}