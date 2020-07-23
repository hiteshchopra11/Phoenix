package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class CollageMaking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collage_making);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Collage Making");

        String trules =
                " 1) Each college can depute only one student participant.\n" +
                        " 2) The competition will be conducted on “IT BASED THEME”.\n" +
                        " 3) The time limit will be 60 minutes.\n" +
                        " 4) The participants should bring their own scissors, glue and other required materials.\n" +
                        " 5) Participants should not cut the pictures to be used prior to commencement of the competition, all kinds of cuttings should be done during the time allotted. \n" +
                        " 6) Participants should reach the venue 15 minutes prior to the commencement of the event.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);

        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CollageMaking.this, CollageMakingRegistration.class);
                startActivity(intent);
//                Toast.makeText(CollageMaking.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(CollageMaking.this, NonTechEvents.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(CollageMaking.this, NonTechEvents.class);
        startActivity(intent);
    }
}