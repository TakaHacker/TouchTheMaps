package com.example.touchthemaps;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuartaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //RECEBE O INTENT COM PACOTE DA TERCEIRA ACTIVITY//
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);

        Intent intent = getIntent();
            Bundle pacotinho = intent.getExtras();

            String salve = pacotinho.getString("Saudacoes");

            TextView Saudacoes = (TextView) findViewById(R.id.salve) ;

            Saudacoes.setText(salve);


         //Início da notificação//
            NotificationCompat.Builder construtor = new NotificationCompat.Builder(this, "meu_canal");

                construtor.setSmallIcon(R.drawable.icone_notificacao);
                construtor.setContentTitle("DESCULPE");
                construtor.setContentText("Em breve adicionaremos mais conteúdo...");
                construtor.setPriority(NotificationCompat.PRIORITY_DEFAULT);

             NotificationManager gerente = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
             gerente.notify(12345,construtor.build());
        //FIM DA NOTIFICAÇÃO//

        //COLOQUEI RADIO BUTTONS PQ NÃO TIVE OUTRA IDÉIA//
        final RadioButton verdadeiro = (RadioButton) findViewById(R.id.verdadeiro);
        final RadioButton falso = (RadioButton) findViewById(R.id.falso);
        Button confirma = (Button) findViewById(R.id.confirma);

        confirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (falso.isChecked())
                    Toast.makeText(getApplicationContext(), "Leia a notificação", Toast.LENGTH_SHORT).show();
                if(verdadeiro.isChecked()){
                    Toast.makeText(getApplicationContext(), "Maneiro!!", Toast.LENGTH_SHORT).show();
                    //BASICAMENTE, ELE FICA FELIZ COM O SIM, E TRISTRIN COM O NÃO//
                }
                }

            });


        }
}
