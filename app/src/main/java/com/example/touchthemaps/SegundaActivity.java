package com.example.touchthemaps;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);


        Toast.makeText(
                getApplicationContext(),
                "Obrigado!",
                Toast.LENGTH_SHORT
        ).show();

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                Bundle pacote = new Bundle();

                if( position == 0 ){
                    pacote.putString("estado", "Paraná");
                    pacote.putString("capital", "Curitiba");
                }

                else if(position == 1){
                    pacote.putString("estado", "Santa Catarina");
                    pacote.putString("capital", "Floripa");
                }

                else{
                    pacote.putString("estado", "Rio Grande do Sul");
                    pacote.putString("capital", "Porto Alegre");
                }

                trocaAtela(pacote);
            }
        };
        ((ListView)findViewById(R.id.lista)).setOnItemClickListener(itemClickListener);

    }

   public void  enviaNomes (View v) {

       AlertDialog.Builder alerta = new AlertDialog.Builder(this);
       alerta.setTitle("Prosseguir?");
       alerta.setMessage("Verifique se os dados estão corretos");

       final DialogInterface.OnClickListener btnSim = new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {

               Bundle pacote = new Bundle();

               TextView nomeEstado = (TextView) findViewById(R.id.nomeEstado);
               TextView nomeCapital = (TextView) findViewById(R.id.nomeCapital);

               pacote.putString("estado", nomeEstado.getText().toString());
               pacote.putString("capital", nomeCapital.getText().toString());

               trocaAtela(pacote);
           }
       };

       alerta.setPositiveButton("Positivo",btnSim);
       alerta.create().show();

   }

   protected void trocaAtela(Bundle pacote){
        Intent intent = new Intent(this, TerceiraActivity.class);

       intent.putExtras(pacote);
       startActivity(intent);
   }



}