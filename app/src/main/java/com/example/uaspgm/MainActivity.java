package com.example.uaspgm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        public void login(View view){
            Intent masuk= new Intent(MainActivity.this,LoginActivity.class);
            startActivity(masuk);
        }
        public void register(View view){
            Intent daftar = new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(daftar);
    }

    }

