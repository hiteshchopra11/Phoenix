package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LanGaming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lan_gaming);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "LAN Gaming");

        String trules =
                " 1) Each team should consist of 5 members only, no less or no more than that.\n" +
                        " 2) Only one boys’ team and one girls’ team from each college is allowed.\n" +
                        " 3) Each team must have one representative or captain responsible for the actions of his team.\n" +
                        " 4) Each member of the team must have a STEAM ACCOUNT and have purchased the game CSGO.\n" +
                        " 5) Steam IDs must be provided at the time of registration.\n" +
                        " 6) Matches will be of 30 rounds, overtime is allowed.\n" +
                        " 7) Any Player found using any type of hacks/unfair means will result in the disqualification of the team right away.\n" +
                        " 8) Configrations are allowed, headphones/earphones are mandatory.\n" +
                        " 9) Players causing intentional failures (deliberately restarting PCs, disconnecting from the server during a match, etc.) will result in immediate ban for the whole team right away.\n" +
                        " 10) If any electrical/server failure occurs during the first three rounds, the match will be played again.\n" +
                        " 11) It is prohibited to insult/abuse a player or a referee during the match, doing so will result in disqualification of the team.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LanGaming.this, LanGamingRegistration.class);
                startActivity(intent);
//                Toast.makeText(LanGaming.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(LanGaming.this, TechEvents.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(LanGaming.this, TechEvents.class);
        startActivity(intent);
    }
}