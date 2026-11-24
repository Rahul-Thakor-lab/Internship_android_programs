package com.example.android_programs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity{
    TextView tvForgetPassword,tvSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvForgetPassword=findViewById(R.id.tvForgotPassword);
        tvForgetPassword.setOnClickListener(v -> {
            Intent i=new Intent(login.this, forget_password.class);
            startActivity(i);
        });
        tvSignUp=findViewById(R.id.tvCreateAccount);
        tvSignUp.setOnClickListener(v -> {
            Intent i=new Intent(login.this, create_account.class);
            startActivity(i);
        });
    }
}