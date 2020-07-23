package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Sketching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sketching);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Sketching");

        String trules =
                "1) Only the drawing sheet will be provided. Other stationery items shall be brought by the participants only.\n" +
                        "2) The sketch must not include words, national flags, slogans , organization or brand name and must not depict any religious theme.\n" +
                        "3) Name and age of participant as well as college’s code and address must be clearly mentioned on the back of sheet in the English Language.\n" +
                        "4) Theme will be disclosed 10 minutes before the commencement of the competition.\n" +
                        "5) Theme will only be based on IT.\n" +
                        "6) No text (including theme title, name, etc.) should be written on the front of the sketch.\n" +
                        "7) Time - 1 hour";

        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sketching.this, SketchingRegistration.class);
                startActivity(intent);
//                Toast.makeText(Sketching.this, "Registrations closed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(Sketching.this, NonTechEvents.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Sketching.this, NonTechEvents.class);
        startActivity(intent);
    }

}
