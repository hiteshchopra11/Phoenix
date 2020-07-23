package com.h3xp40it.ggdsd.phoenix;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AudiEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audi_events);
        TextView textView = findViewById(R.id.textBox);
        textView.setText("" + "Audi events");

        ImageView img = findViewById(R.id.oneImg);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudiEvents.this, Dance.class);
                startActivity(intent);

            }
        });

        ImageView img1 = findViewById(R.id.twoImg);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudiEvents.this, Singing.class);
                startActivity(intent);
            }
        });

        ImageView img2 = findViewById(R.id.threeImg);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudiEvents.this, Skit.class);
                startActivity(intent);

            }
        });

        ImageView img3 = findViewById(R.id.fourImg);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudiEvents.this, AdMadShow.class);
                startActivity(intent);

            }
        });

        ImageView img4 = findViewById(R.id.fiveImg);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudiEvents.this, Mimicry.class);
                startActivity(intent);

            }
        });

        ImageView img5 = findViewById(R.id.sixImg);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudiEvents.this, Quiz.class);
                startActivity(intent);

            }
        });


    }

    public void back(View view) {
        Intent intent = new Intent(AudiEvents.this, Events.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(AudiEvents.this, Events.class);
        startActivity(intent);
    }
}