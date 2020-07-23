package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Skit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skit);
        TextView txt = findViewById(R.id.textBox);

        String trules =
                " 1) Theme must be based on Information Technology..\n" +
                " 2) Skit performance should not exceed 10 minutes.\n" +
                " 3) Each college can have only one team.\n" +
                " 4) Team should consist of 5-6 members.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);


        txt.setText("" + "Skit");
        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Skit.this, Skit.class);
                startActivity(intent);
//                Toast.makeText(Skit.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(Skit.this, AudiEvents.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Skit.this, AudiEvents.class);
        startActivity(intent);
    }
}
