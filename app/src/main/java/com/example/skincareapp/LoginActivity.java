package com.example.skincareapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    MaterialButton signin;
    DataBase DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username1);
        password = findViewById(R.id.password1);
        signin = findViewById(R.id.login_btn);
        DB = new DataBase(this);

        signin.setOnClickListener(view -> {

            String user=username.getText().toString();
            String pass=password.getText().toString();

            if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                Toast.makeText(LoginActivity.this,"All fields required !!",Toast.LENGTH_SHORT).show();
            else {
                Boolean checkuserpass= DB.checkusernamepassword(user,pass);
                if (checkuserpass) {
                    Toast.makeText(LoginActivity.this,"Signin Successful !", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getApplicationContext(), GenderActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this,"Signin Failed...", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }

}