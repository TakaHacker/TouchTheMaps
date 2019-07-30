package com.example.touchthemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //RECEBE O INTENT COM PACOTE DA SEGUNDA ACTIVITY//
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);


        Intent intent = getIntent();
        Bundle pacote = intent.getExtras();

        String nomeEstado = pacote.getString("estado");
        String nomeCapital = pacote.getString("capital");

        //LOCALIZA OS TEXT'S VIEW'S NA TELA//
        TextView campoEstado = findViewById(R.id.nomeEstado);
        TextView campoCapital = findViewById(R.id.nomeCapital);

        //SETAGEM//
        campoEstado.setText(nomeEstado);
        campoCapital.setText(nomeCapital);

    }

    public void vaiPraOutraTela (View v){
        Intent intent =  new Intent (this, SegundaActivity.class);
        startActivity(intent);
    }

    public void foiClicado(View v){
        Intent intent = new Intent(this, QuartaActivity.class );
             Bundle pacotinho = new Bundle();

             TextView salve = (TextView) findViewById(R.id.salve);

             pacotinho.putString("Saudacoes", salve.getText().toString());

             intent.putExtras(pacotinho);

                startActivity(intent);



    }

}
