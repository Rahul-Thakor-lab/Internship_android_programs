package com.example.android_programs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lstV;
    String[] items=new String[]{"(1)Login","(2)Forget Password","(3)Create Account"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstV=findViewById(R.id.activityList);
        ArrayAdapter<String> itemsLst=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        lstV.setAdapter(itemsLst);
        lstV.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Class<?>[] destClass ={login.class, forget_password.class, create_account.class};

        startActivity(new Intent(this,destClass[position]));
    }
}