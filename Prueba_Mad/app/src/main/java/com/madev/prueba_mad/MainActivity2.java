package com.madev.prueba_mad;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText numone, numtwo;
    Button boton;
    TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Se llama cada vez que la pantalla se crea
        setContentView(R.layout.activity_main3);

         numone = findViewById(R.id.numone);
         numtwo = findViewById(R.id.numtwo);

         boton = findViewById(R.id.boton);

         txtresult = findViewById(R.id.txtresult);

         boton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String caja1 = numone.getText().toString();
                 String caja2 = numtwo.getText().toString();

                 if (!caja1.equals("") && !caja2.equals("")) {
                     int c1 = Integer.parseInt(caja1);
                     int c2 = Integer.parseInt(caja2);
                     int sum = c1 + c2;

                     txtresult.setText(sum+"");
                 } else{
                         Toast.makeText(MainActivity2.this,"Rellenar las Casillas, Por Favor",Toast.LENGTH_LONG).show();
                     }
             }
         });
    }
}