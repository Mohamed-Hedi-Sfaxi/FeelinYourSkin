package com.example.skincareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MaleSkinActivity extends AppCompatActivity {

    MaterialButton MaleOily,MaleDry,MaleMixed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_skin);

        MaleOily = findViewById(R.id.MaleOilyBtn);
        MaleDry = findViewById(R.id.MaleDryBtn);
        MaleMixed = findViewById(R.id.MaleMixedBtn);

        MaleOily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GlobalVariables.RoutineType.equals("RoutineTypeDay")) {
                    Intent intent = new Intent(MaleSkinActivity.this , MaleDayOilyActivity.class);
                    startActivity(intent);
                } else if (GlobalVariables.RoutineType.equals("RoutineTypeNight")) {
                    Intent intent = new Intent(MaleSkinActivity.this , MaleNightOilyActivity.class);
                    startActivity(intent);
                }
            }
        });

        MaleDry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GlobalVariables.RoutineType.equals("RoutineTypeDay")) {
                    Intent intent = new Intent(MaleSkinActivity.this , MaleDayDryActivity.class);
                    startActivity(intent);
                } else if (GlobalVariables.RoutineType.equals("RoutineTypeNight")) {
                    Intent intent = new Intent(MaleSkinActivity.this , MaleNightDryActivity.class);
                    startActivity(intent);
                }
            }
        });

        MaleMixed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GlobalVariables.RoutineType.equals("RoutineTypeDay")) {
                    Intent intent = new Intent(MaleSkinActivity.this , MaleDayMixedActivity.class);
                    startActivity(intent);
                } else if (GlobalVariables.RoutineType.equals("RoutineTypeNight")) {
                    Intent intent = new Intent(MaleSkinActivity.this , MaleNightMixedActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}