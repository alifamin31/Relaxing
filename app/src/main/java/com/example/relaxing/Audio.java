package com.example.relaxing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Audio extends AppCompatActivity {

    Button abird, ajungle, arain, ariver, ahappy, asad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        abird = findViewById(R.id.bird);
        ajungle = findViewById(R.id.jungle);
        arain = findViewById(R.id.rain);
        ariver = findViewById(R.id.river);
        ahappy = findViewById(R.id.happy);
        asad = findViewById(R.id.sad);

        abird.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Bird.class));
            }
        });

        ajungle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Jungle.class));
            }

        });

        arain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Rain.class));
            }

        });

        ariver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), River.class));
            }

        });

        ahappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Happy.class));
            }

        });

        asad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Sad.class));
            }

        });
    }
}