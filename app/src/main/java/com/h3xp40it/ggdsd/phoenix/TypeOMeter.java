package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TypeOMeter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_o_meter);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Type-O-Meter");

        String trules =
                " 1) Only one participant from each college/institution is allowed.\n" +
                        " 2) Each participant shall be given a similar read out which has to be typed in MS-Word.\n" +
                        " 3) The candidate has to finish the typing in 10 minutes with proper formatting.\n" +
                        " 4) Judgment will be done on the basis of number of words written in 10 minutes and presentation style.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOMeter.this, TypOMeterRegistration.class);
                startActivity(intent);
//                Toast.makeText(TypeOMeter.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(TypeOMeter.this, TechEvents.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(TypeOMeter.this, TechEvents.class);
        startActivity(intent);
    }
}