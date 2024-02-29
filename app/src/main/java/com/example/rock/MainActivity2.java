package com.example.rock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private TextView j1,j2,resultat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String name1 = intent.getStringExtra("player1");
        String name2 = intent.getStringExtra("player2");
        j1=(TextView)findViewById(R.id.j1);
        j2=(TextView)findViewById(R.id.j2);
        j1.setText(name1);
        j2.setText(name2);
        resultat=(TextView)findViewById(R.id.resultat);
        Button go=(Button) findViewById(R.id.button);
        ImageView image1=(ImageView)findViewById(R.id.img1);
        ImageView image2=(ImageView)findViewById(R.id.img2);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int m = random.nextInt(3) + 1;
                int n = random.nextInt(3) + 1;
                switch (m){
                    case 1:image1.setImageResource(R.drawable.rock);break;
                    case 2:image1.setImageResource(R.drawable.paper);break;
                    case 3:image1.setImageResource(R.drawable.sessor);break;
                }
                switch (n){
                    case 1:image2.setImageResource(R.drawable.rock);break;
                    case 2:image2.setImageResource(R.drawable.paper);break;
                    case 3:image2.setImageResource(R.drawable.sessor);break;
                }

                if (m == n) {
                    resultat.setText("égalité");
                } else if ((m == 1 && n == 3) || (m == 2 && n == 1) || (m == 3 && n == 2)) {
                    resultat.setText(name1+" gagne");
                } else {
                    resultat.setText(name2+" gagne");
                }
            }
        });
    }
}