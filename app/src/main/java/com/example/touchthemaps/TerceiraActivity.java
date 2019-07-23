package com.example.touchthemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);


        Intent intent = getIntent();
        Bundle pacote = intent.getExtras();

        String nomeEstado = pacote.getString("estado");
        String nomeCapital = pacote.getString("capital");

        TextView campoEstado = findViewById(R.id.nomeEstado);
        TextView campoCapital = findViewById(R.id.nomeCapital);

        campoEstado.setText(nomeEstado);
        campoCapital.setText(nomeCapital);



    }
}
