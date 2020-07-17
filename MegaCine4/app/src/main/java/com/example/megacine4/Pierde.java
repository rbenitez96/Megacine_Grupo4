package com.example.megacine4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pierde extends AppCompatActivity {
    int puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pierde);
        Intent intent = getIntent();
        puntos = intent.getIntExtra("puntos",0);
    }

    public void salir(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}