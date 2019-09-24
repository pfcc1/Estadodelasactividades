package com.example.tablademultiplicar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   EditText tabla;
   TextView mostrartabla;
   Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ok=findViewById(R.id.aceptar);
    mostrartabla=findViewById(R.id.mostrar);
    tabla=findViewById(R.id.inputnumero);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;
                int valor=Integer.parseInt(tabla.getText().toString());
                for(i=0;i<=10;i++){
                   // mostrartabla.setText(mostrartabla.getText()+"\n"+i+" x "+valor+" = "+(i*valor));
                    //mostrartabla.setText(i+" x "+valor+" = "+(i*valor)+"\n");

                }
            }
        });

    }
}
