package com.h3xp40it.ggdsd.phoenix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Singing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singing);
        TextView txt = findViewById(R.id.textBox);
        txt.setText("" + "Singing");

        String trules =
                "1) Only one participant from each institute/college is allowed. The vocalist may be accompanied by a guitarist.\n" +
                        "2) The candidate will be given 3-4 minutes to present their song.\n" +
                        "3) If you want background music then make your Own Arrangement. And bring it in USB's only. Else you will be \"ELIMINATED\"\n" +
                        "4) Decent songs should be selected in any language.";


        TextView txt1 = findViewById(R.id.tr);
        txt1.setText(trules);


        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Singing.this, SingingRegistration.class);
                startActivity(intent);
//                Toast.makeText(Singing.this, "Registrations closed", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(Singing.this, AudiEvents.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Singing.this, AudiEvents.class);
        startActivity(intent);
    }
}
