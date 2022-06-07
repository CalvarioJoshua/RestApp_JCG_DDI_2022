package com.example.restpapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.restpapp.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private final List <String>mensajes = Arrays.asList(
    "Buenos días","Hola Como estas","Buenas las Tengas","Bye Bye","Cuidate Mucho","Holis","Buenas",
    "Adios","Que tranza","Quioñaquioña");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTextView = findViewById(R.id.MsjTextView);
        mButton = findViewById(R.id.Button);

        mTextView.setText(mensajes.get[1]);
        mTextView.setText(mensajes);
    }
}