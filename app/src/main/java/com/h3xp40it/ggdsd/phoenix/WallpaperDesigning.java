package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WallpaperDesigning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper_designing);
        TextView txt = findViewById(R.id.textBox);

        String trules =
                " 1) The theme for wallpaper designing will be disclosed 5 minutes before the commencement of the event.\n" +
                        " 2) Software to be used - Photoshop. \n" +
                        " 3) All the graphical assents will be provided.\n" +
                        " 4) Only one participant per college is allowed.\n" +
                        " 5) Every participant must reach the venue 15 minutes before the commencement of the event.\n" +
                        " 6) Time limit for the event will be 30 minutes.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);


        txt.setText("" + "Wallpaper Designing");
        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WallpaperDesigning.this, WallpaperDesigningRegistration.class);
                startActivity(intent);
//                Toast.makeText(WallpaperDesigning.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(WallpaperDesigning.this, TechEvents.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(WallpaperDesigning.this, TechEvents.class);
        startActivity(intent);
    }
}