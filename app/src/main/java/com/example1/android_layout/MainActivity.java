package com.example1.android_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

    // Mudanças no layout usando o themes, colors e strings.xml

    // Criação de Strings usando o strings.xml

        /*
        Para alterar a orientação da tela, alteração no arquivo AndroidManifest
        android:screenOrientation="valor"
        Portrait - Paisagem
        Landscape - Retrato
        Sensor - Ambos
        */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}