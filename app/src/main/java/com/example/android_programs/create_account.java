package com.example.android_programs;

import android.content.Intent;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

import java.util.regex.Pattern;

public class create_account extends AppCompatActivity {

    EditText edName,edEmail,edMobile,edPassword,edConfirmPassword;
    Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        edName=findViewById(R.id.etName);
        edEmail=findViewById(R.id.etEmail);
        edMobile=findViewById(R.id.etMobile);
        edPassword=findViewById(R.id.etPassword);
        edConfirmPassword=findViewById(R.id.etPassword);


        btnSignUp=findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(v -> {

            String Name=edName.getText().toString();
            String Email=edEmail.getText().toString();
            String Mobile=edMobile.getText().toString();
            String Password=edPassword.getText().toString();
            String ConfirmPassword=edConfirmPassword.getText().toString();



            if(Name.isEmpty()){
                edName.setError("Enter Name");
                edName.requestFocus();
                return;
            }

            if(Email.isEmpty()){
                edEmail.setError("Enter Email");
                edEmail.requestFocus();
                return;
            }
            if(Mobile.isEmpty()){
                edMobile.setError("Enter Mobile");
                edMobile.requestFocus();
                return;
            }

            if(Password.isEmpty()){
                edPassword.setError("Enter Password");
                edPassword.requestFocus();
                return;
            }
            if(ConfirmPassword.isEmpty()){
                edConfirmPassword.setError("Enter ConfirmPassword");
                edConfirmPassword.requestFocus();
                return;
            }

//            if(Password.length()>7)
            if(!Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
                edEmail.setError("Enter Valid Email");
                edEmail.requestFocus();
                return;
            }

            if(!ConfirmPassword.equals(Password)){
                edConfirmPassword.setError("Password Not Match");
                edConfirmPassword.requestFocus();
                return;
            }
            Snackbar.make(
                    findViewById(android.R.id.content),
                    "Successfull account created",
                    Snackbar.LENGTH_SHORT
            ).show();
        });
    }
}