package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Debugging extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debugging);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Debugging");


        String trules =
                " 1) The time limit for the contest is 45 minutes.\n" +
                        " 2) Only one participant per college is allowed.\n" +
                        " 3) Each participant will be given program sheets in C and/or C++ to debug.\n" +
                        " 4) Contestants cannot bring any notes or textbooks to the contest room.\n" +
                        " 5) Blank sheets of paper will be supplied for rough work.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);

        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Debugging.this, DebuggingRegistration.class);
                startActivity(intent);
//                Toast.makeText(Debugging.this, "Registrations closed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(Debugging.this, TechEvents.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Debugging.this, TechEvents.class);
        startActivity(intent);
    }
}
