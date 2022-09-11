package com.example.calculadora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class espacioblanco extends AppCompatActivity {
        private EditText espacioblanco;
        private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espacioblanco);

        espacioblanco = findViewById(R.id.txtespacioblanco);
        resultado = findViewById(R.id.respuestaespacio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void espacioblanco(View v){
        String espacio = espacioblanco.getText().toString();
        String aea = espacio.replaceAll("\\s+","");
        resultado.setText(String.valueOf(aea));
    }
}