package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private Button btningresar;
    private EditText txtemail, txtpassword;
    static final String user = "jorgequispes@upeu.edu.pe";
    static final String password = "aea123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtemail = findViewById(R.id.txtemail);
        txtpassword = findViewById(R.id.txtpass);
        btningresar = findViewById(R.id.btningresar);

    }
    public void login(View view){
        String username = txtemail.getText().toString().trim();
        String p = txtpassword.getText().toString().trim();
        if (username.equals("") && p.equals("")){
            Toast.makeText(getApplicationContext(),"Ingresar Datos:",Toast.LENGTH_LONG).show();
        }else {
            if(username.equals(username) && p.equals(password)){

                Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), menu.class);
                startActivity(i);

            }else{
                Toast.makeText(getApplicationContext(), "Datos incorrectos" , Toast.LENGTH_LONG).show();
            }
        }
    }




}