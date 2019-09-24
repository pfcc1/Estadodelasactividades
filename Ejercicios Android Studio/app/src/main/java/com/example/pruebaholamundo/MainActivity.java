package com.example.pruebaholamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView etiqueta=findViewById(R.id.miTexto);

        for(int i=0;i<10;i++){
            etiqueta.setText(etiqueta.getText()+" "+i+" Hola Mundo\n");
        }

    }
}
