package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LinuxTreasureHunt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linux_treasure_hunt);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Pirates of Linux");


        String str = "The goal of this event is for you to log into the different levels using SSH. The " +
                "host to which you need to connect is 192.168.22.1, on port 221. To START, the " +
                "username is level 0 and the password is level 0. Once logged in, find out a " +
                "clue.txt file which contains a hint. Using that hint, find password.txt file, which " +
                "contains credentials and login details to the next level.";
        TextView des = findViewById(R.id.des);
        des.setText(str);

        String trules =
                " 1) Only 1 member per team per college is allowed.\n" +
                        " 2) The game consist of total 5 levels.\"\n" +
                        " 3) The contestant who reaches the level 5 or the highest level first, will be considered as winner.\n" +
                        " 4) If 2 contestant reach same level in the time provided, first one to log in to that level will be the winner.\n" +
                        " 5) Time provided for the game is 45 min.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);

        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinuxTreasureHunt.this, TreasureHuntRegistration.class);
                startActivity(intent);
//                Toast.makeText(LinuxTreasureHunt.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(LinuxTreasureHunt.this, TechEvents.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(LinuxTreasureHunt.this, TechEvents.class);
        startActivity(intent);
    }
}
