package com.example.skincareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class SignUpActivity extends AppCompatActivity {

    EditText username, password, repassword;
    MaterialButton signup;
    DataBase DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        repassword=findViewById(R.id.RePassword);
        signup=findViewById(R.id.signup_btn);
        DB= new DataBase(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user= username.getText().toString();
                String pass= password.getText().toString();
                String repass= repassword.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(repass))
                    Toast.makeText(SignUpActivity.this, "All fields Required !!", Toast.LENGTH_SHORT).show();
                else {
                    if(pass.equals(repass)) {
                        Boolean checkuser = DB.checkusername(user);
                        if(!checkuser){
                            Boolean insert = DB.insertData(user,pass);
                            if(insert){
                                Toast.makeText(SignUpActivity.this,"Registration complete !",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), GenderActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(SignUpActivity.this,"Registration Failed...",Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(SignUpActivity.this,"You already have an account",Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(SignUpActivity.this,"Passwords do not match",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }
}