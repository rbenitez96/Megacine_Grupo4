package com.example.megacine4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pierde extends AppCompatActivity {
    int puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pierde);
        TextView txtpreguntas = (TextView) findViewById(R.id.txtPreg);
        Intent intent = getIntent();
        puntos = intent.getIntExtra("puntos",0);
        String texto = "Usted ha acetado "+String.valueOf(puntos)+" preguntas";
        txtpreguntas.setText(texto);
    }

    public void salir(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}