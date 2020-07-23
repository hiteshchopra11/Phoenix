package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        ImageView audiEvents = findViewById(R.id.audi_events);
        audiEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this, AudiEvents.class);
                startActivity(intent);


            }
        });

        ImageView techEvents = findViewById(R.id.tech_events);
        techEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this, TechEvents.class);
                startActivity(intent);

            }
        });

        ImageView nonTechEvents = findViewById(R.id.non_tech_events);
        nonTechEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this, NonTechEvents.class);
                startActivity(intent);

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(Events.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Events.this, MainActivity.class);
        startActivity(intent);
    }
}
