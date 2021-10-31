package com.leandro.projetofirebasenew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FromCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_cadastro);

        getSupportActionBar().hide();
    }
}