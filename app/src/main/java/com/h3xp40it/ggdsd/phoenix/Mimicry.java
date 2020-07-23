package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Mimicry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mimicry);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Mimicry");

        String trules =
                "1 This is a solo event.\n" +
                        "2. Each participant shall be given 5 minutes.\n" +
                        "3. Judgement will be based on imitating skill, variety of sound and voices imitated presentation.\n" +
                        "4. No vulgar language will be entertainment.\n" +
                        "5. The decision of the judge will be final.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mimicry.this, Mimicry.class);
                startActivity(intent);
//                Toast.makeText(Mimicry.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(Mimicry.this, AudiEvents.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Mimicry.this, AudiEvents.class);
        startActivity(intent);
    }
}
