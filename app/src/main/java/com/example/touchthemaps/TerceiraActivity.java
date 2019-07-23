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
    }

    Intent intent = getIntent();
    Bundle bundle = intent.getExtras();
    String editText = bundle.getString("nameField");
    TextView nameField = findViewById(R.id.editText);


}
