package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Dance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Dance");

        String trules =
                "1) Only one team per College is allowed. \n" +
                        "2) Maximum no. of participants per team should not exceed 8.\n" +
                        "3) Time limit for each performance will be 5 to 7 minutes.\n" +
                        "4) Maximum 2 minutes will be allotted for stage setting.\n" +
                        "5) You Must Bring Your PROPS/MUSIC in USBs (Pendrives) only. No other thing will be Acceptable OR You Will be ELIMINATED ";

        String wrules =
                "1) Only one team per College is allowed. \n" +
                        "2) Maximum number of participants per team should not exceed 8.\n" +
                        "3) Time limit for each performance will be 5 to 7 minutes.\n" +
                        "4) Maximum 2 minutes will be allotted for stage setting.\n" +
                        "5) You Must Bring Your PROPS/MUSIC in USBs (Pendrives) Only No other thing will be Acceptable OR You Will be ELIMINATED.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);

        TextView txt2 = findViewById(R.id.wr);
        txt2.setText(wrules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dance.this, DanceRegisteration.class);
                startActivity(intent);
//                Toast.makeText(Dance.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(Dance.this, AudiEvents.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Dance.this, AudiEvents.class);
        startActivity(intent);
    }
}
