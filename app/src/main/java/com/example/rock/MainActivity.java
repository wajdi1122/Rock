package com.example.rock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button debut=(Button) findViewById(R.id.debut);
        EditText name1=(EditText)findViewById(R.id.name1);
        EditText name2=(EditText)findViewById(R.id.name2);

        debut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("player1",name1.getText().toString());
                intent.putExtra("player2",name2.getText().toString());
                startActivity(intent);
            }
        });
    }
}