package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Rangoli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangoli);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Rangoli");

        String trules =
                " 1) Each college can depute only one team consisting of two members. \n" +
                        " 2) The competition will be conducted on “IT BASED THEME”.\n" +
                        " 3) The total duration for completing the Rangoli shall not exceed one hour.\n" +
                        " 4) The participants should bring their required material\n" +
                        " 5) Participants are only allowed to use powder colors.\n" +
                        " 6) Participants should reach the venue 15 minutes prior to the commencement of the event.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);

        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rangoli.this, RangoliRegistration.class);
                startActivity(intent);
//               Toast.makeText(Rangoli.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(Rangoli.this, NonTechEvents.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Rangoli.this, NonTechEvents.class);
        startActivity(intent);
    }
}