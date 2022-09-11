package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
        private Button btns, btnraiz, btnparim, btnvaci;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btns = findViewById(R.id.btnsumar);
        btnraiz = findViewById(R.id.btnraiz);
        btnparim = findViewById(R.id.btnparimpar);
        btnvaci = findViewById(R.id.btnvacios);
    }
    public void suma(View v){
        Intent i = new Intent(getApplicationContext(), suma.class);
        startActivity(i);
    }
    public void raiz(View v){
        Intent i = new Intent(getApplicationContext() , raiz.class);
        startActivity(i);
    }
    public void parimpar(View v){
        Intent i = new Intent(getApplicationContext(), parimpar.class);
        startActivity(i);
    }
    public void espacio(View v){
        Intent i = new Intent(getApplicationContext(), espacioblanco.class);
        startActivity(i);
    }
}