package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class AdMadShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_mad_show);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Ad Mad Show");

        String trules =
                " 1) The product for the advertisement will be given one hour before the commencement of the event.\n" +
                        " 2) The performance should not exceed 5 minutes.\n" +
                        " 3) Each college can have only one team.\n" +
                        " 4) Each team should consist of 5 members.";

        String wrules =

                " • Content\n" +
                        " • Punch lines\n" +
                        " • Genuine Acting";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);

        TextView txt2 = findViewById(R.id.wr);
        txt2.setText(wrules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdMadShow.this, AdMadShowRegistration.class);
                startActivity(intent);
//                Toast.makeText(AdMadShow.this, "Registrations closed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(AdMadShow.this, AudiEvents.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(AdMadShow.this, AudiEvents.class);
        startActivity(intent);
    }
}
