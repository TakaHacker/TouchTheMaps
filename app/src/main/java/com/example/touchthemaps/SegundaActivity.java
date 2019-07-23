package com.example.touchthemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

   public void  enviaNomes (View v){
       Intent intent = new Intent(this, TerceiraActivity.class);
       Bundle bundle = new Bundle();
       TextView textView = (TextView) findViewById(R.id.editText);
       bundle.putString("nameField", textView.getText().toString());
       intent.putExtras(bundle);
       startActivity(intent);

   }
}
