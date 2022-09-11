package com.example.calculadora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class raiz extends AppCompatActivity {

    private EditText num1;

    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiz);

        num1 = findViewById(R.id.txtraiz);
        res = findViewById(R.id.respuestaraiz);
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
    public void calraiz(View v){
        Double num = Double.parseDouble(num1.getText().toString());
        Double resultad ;

        if (num < 0){
            res.setText(String.valueOf("SOLO NUMEROS POSITIVOS"));
        }else{
            resultad = Math.sqrt(num);
            res.setText(String.valueOf(resultad));
        }


    }
}