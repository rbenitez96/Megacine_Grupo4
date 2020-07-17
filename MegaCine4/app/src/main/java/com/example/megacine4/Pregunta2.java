package com.example.megacine4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Pregunta2 extends AppCompatActivity {
    int puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);
        TextView pregunta = (TextView) findViewById(R.id.textViewP2);
        pregunta.setText("¿En que pelicula sale este personaje?");
        Intent intent = getIntent();
        puntos = intent.getIntExtra("puntos",0);




    }

    public void correcto(View v){
        puntos++;
        Random rand = new Random();
        int n = rand.nextInt(3) + 2;
        if(puntos==5){
            Toast.makeText(this,"Ganaste",Toast.LENGTH_SHORT).show();
        }
        else if(n==2 && puntos!=0){
            Intent i = new Intent(this,Pregunta1.class);
            i.putExtra("puntos",puntos);
            startActivity(i);
            finish();
        }
        else if(n==3 && puntos!=0){
            Intent i = new Intent(this,Pregunta5.class);
            i.putExtra("puntos",puntos);
            startActivity(i);
            finish();
        }
        else if(n==4 && puntos!=0){
            Intent i = new Intent(this,Pregunta3.class);
            i.putExtra("puntos",puntos);
            startActivity(i);
            finish();
        }
        else if(n==5 && puntos!=0){
            Intent i = new Intent(this,Pregunta4.class);
            i.putExtra("puntos",puntos);
            startActivity(i);
            finish();
        }




    }

    public void incorrecto(View v){
        Toast.makeText(this,"Perdiste",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,Pregunta2.class);
        i.putExtra("puntos",puntos);
        startActivity(i);
        finish();

    }


}