package com.example.sumadedosnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button suma,multiplicar;
    TextView operador1, operador2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operador1 = findViewById(R.id.editText1);
        operador2 = findViewById(R.id.editText2);
        resultado = findViewById(R.id.editTextResultado);
        suma = findViewById(R.id.botonsuma);
        multiplicar=findViewById(R.id.botonmultiplicar);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(sumar(operador1, operador2)));
                // resultado.setText(""+sumar(operador1,operador2));
            }

        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(multiplicar(operador1,operador2)));
            }
        });



    }

    int sumar(TextView uno, TextView dos) {
        int valor1;
        int valor2;
        int valorsuma;
        valor1 = Integer.parseInt(uno.getText().toString());
        valor2 = Integer.parseInt(dos.getText().toString());
        valorsuma = valor1 + valor2;
        return valorsuma;
        //return Integer.parseInt((String)uno.getText()+Integer.parseInt((String)dos.getText()));
    }

    int multiplicar(TextView uno, TextView dos) {
        int valor1;
        int valor2;
        int valormultiplicacion;
        valor1 = Integer.parseInt(uno.getText().toString());
        valor2 = Integer.parseInt(dos.getText().toString());
        valormultiplicacion=valor1*valor2;
        return  valormultiplicacion;
    }
}
