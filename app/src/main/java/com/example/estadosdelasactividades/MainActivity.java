package com.example.estadosdelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public static String TAG="PRINCIPAL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(), "Estoy en OnCreate", Toast.LENGTH_LONG);
        toast.show();
        Log.i(TAG,"Hola Estoy en onCreate");

      /*  try{
            int j=1/0;
        }catch (ArithmeticException e){
           // Log.e(TAG,)
        }
        
       */
    }



    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Estoy en onStart", Toast.LENGTH_LONG).show();
        Log.i(TAG,"Hola Estoy en onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Estoy en onStop", Toast.LENGTH_LONG).show();
        Log.i(TAG,"Hola Estoy en onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Estoy en onDestroy", Toast.LENGTH_LONG).show();
        Log.i(TAG,"Hola Estoy en onDestroy");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this, "Estoy en onPostResume", Toast.LENGTH_LONG).show();
        Log.i(TAG,"Hola Estoy en onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Estoy en onPause", Toast.LENGTH_LONG).show();
        Log.i(TAG,"Hola Estoy en onPause");
    }
}
