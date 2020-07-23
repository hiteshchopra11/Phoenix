package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TShirtPainting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirt_painting);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "T-Shirt Painting");

        String trules =
                " 1) Each college can have only one participant.\n" +
                        " 2) Each participant is required to bring their own fabric colors and other materials required.\n" +
                        " 3) Theme will be disclosed 10 minutes before the commencement of the competition.\n" +
                        " 4) Time limit for the event will be 60 minutes.\n" +
                        " 5) T-shirts will be provided to each team.\n" +
                        " 6) Participants should reach the venue 15 minutes prior to the commencement of the event.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);

        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TShirtPainting.this, TShirtPaintingRegistration.class);
                startActivity(intent);
                Toast.makeText(TShirtPainting.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(TShirtPainting.this, NonTechEvents.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(TShirtPainting.this, NonTechEvents.class);
        startActivity(intent);
    }
}