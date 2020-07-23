package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class FacePainting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_painting);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Face Painting");

        String trules =
                " 1) Team event (2 people – the one who will paint and the other whose face will be painted).\n" +
                        " 2) Theme will be disclosed 10 minutes before the commencement of the competition.\n" +
                        " 3) Theme will only be based on IT.\n"+
                        " 4) Participant have to carry their own material. Materials will not be provided at the spot.\n" +
                        " 5) Time – 1 hour.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacePainting.this, FacePaintingRegistration.class);
//                Toast.makeText(FacePainting.this, "Registrations closed", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(FacePainting.this, NonTechEvents.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(FacePainting.this, NonTechEvents.class);
        startActivity(intent);
    }
}