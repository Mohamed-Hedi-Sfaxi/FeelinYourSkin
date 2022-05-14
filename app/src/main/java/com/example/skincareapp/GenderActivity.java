package com.example.skincareapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class GenderActivity extends AppCompatActivity {

    MaterialButton Male,Female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        Male = findViewById(R.id.MaleBtn);
        Female = findViewById(R.id.FemaleBtn);

        Male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalVariables.GenderType = "GenderTypeMale";
                Intent intent = new Intent(GenderActivity.this , RoutineTypeActivity.class);
                startActivity(intent);
            }
        });

        Female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GlobalVariables.GenderType = "GenderTypeFemale";
                Intent intent = new Intent(GenderActivity.this , RoutineTypeActivity.class);
                startActivity(intent);
            }
        });

    }

}