package com.madev.parcial1_made;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btningresar;

    EditText usuario, contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        contraseña = findViewById(R.id.contraseña);

        btningresar = findViewById(R.id.btningresar);

        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String ingusuario = usuario.getText().toString();
            String ingcontra = contraseña.getText().toString();

                if (ingusuario.equals("") && ingcontra.equals("")) {
                    Toast.makeText(MainActivity.this, "Por favor llenar los campos", Toast.LENGTH_LONG).show();

                    if (!ingusuario.equals("uac123") && !ingcontra.equals("12345678")) {
                        Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
                    }

                }else{
                    Intent intent = new Intent(MainActivity.this,Second.class);
                    startActivity(intent);
                }
            }
        });

    }
}