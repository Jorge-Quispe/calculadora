package com.example.calculadora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class parimpar extends AppCompatActivity {


        private EditText parimpar;
        private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parimpar);
        parimpar= findViewById(R.id.txtparimpar);
        resultado = findViewById(R.id.txtresulparim);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void resultadoparimpar (View v){
        double parimpares = Double.parseDouble(parimpar.getText().toString());
        if(parimpares % 2 == 0){
            resultado.setText(String.valueOf("par"));
        }else{
            resultado.setText(String.valueOf("Impar"));

        }
    }
}