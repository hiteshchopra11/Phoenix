package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class NonTechEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_tech_events);
        TextView textView = findViewById(R.id.textBox);
        textView.setText("" + "Non technical events");

        ImageView img1 = findViewById(R.id.oneImg);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NonTechEvents.this, Rangoli.class);
                startActivity(intent);

            }
        });

        ImageView img2 = findViewById(R.id.twoImg);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NonTechEvents.this, CollageMaking.class);
                startActivity(intent);

            }
        });

        ImageView img3 = findViewById(R.id.threeImg);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NonTechEvents.this, PosterMaking.class);
                startActivity(intent);

            }
        });

        ImageView img4 = findViewById(R.id.fourImg);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NonTechEvents.this, TShirtPainting.class);
                startActivity(intent);

            }
        });

        ImageView img5 = findViewById(R.id.fiveImg);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NonTechEvents.this, FacePainting.class);
                startActivity(intent);

            }
        });

        ImageView img6 = findViewById(R.id.sixImg);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NonTechEvents.this, Sketching.class);
                startActivity(intent);

            }
        });

    }

    public void back(View view) {
        Intent i = new Intent(NonTechEvents.this, Events.class);
        startActivity(i);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(NonTechEvents.this, Events.class);
        startActivity(intent);
    }
}
